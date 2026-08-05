package com.lexis.search;

import com.lexis.index.InvertedIndex;
import java.util.Collections;
import java.util.List;

/** YOU IMPLEMENT BM25 per specs/v2_bm25.md */
public final class Bm25Searcher {
  private final InvertedIndex index;
  private final double k1;
  private final double b;

  public Bm25Searcher(InvertedIndex index, double k1, double b) {
    this.index = index;
    this.k1 = k1;
    this.b = b;
  }

  public List<ScoredDoc> search(String query, int k) {
    return Collections.emptyList();
  }
}
