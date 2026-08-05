package com.lexis;

import static org.junit.jupiter.api.Assertions.*;

import com.lexis.index.InvertedIndex;
import com.lexis.search.Bm25Searcher;
import com.lexis.search.ScoredDoc;
import com.lexis.tokenize.Tokenizer;
import java.util.List;
import org.junit.jupiter.api.Test;

class LexisTest {
  @Test
  void tokenizeBasic() {
    Tokenizer t = new Tokenizer();
    List<String> toks = t.tokenize("Hello, World!");
    assertEquals(List.of("hello", "world"), toks);
  }

  @Test
  void indexPostings() {
    InvertedIndex idx = new InvertedIndex();
    idx.addDocument(1, "red fox");
    idx.addDocument(2, "fox jumps");
    assertFalse(idx.postings("fox").isEmpty());
    assertEquals(2, idx.postings("fox").size());
  }

  @Test
  void bm25OrdersRelevantFirst() {
    InvertedIndex idx = new InvertedIndex();
    idx.addDocument(1, "cats cats cats");
    idx.addDocument(2, "dogs and foxes");
    idx.addDocument(3, "cats and dogs");
    Bm25Searcher s = new Bm25Searcher(idx, 1.2, 0.75);
    List<ScoredDoc> hits = s.search("cats", 3);
    assertFalse(hits.isEmpty());
    assertEquals(1, hits.get(0).docId());
  }
}
