package com.lexis.index;

import java.util.Collections;
import java.util.List;

/** YOU IMPLEMENT per specs/v1_index.md */
public final class InvertedIndex {
  public void addDocument(int docId, String text) {
    // stub
  }

  public List<Posting> postings(String term) {
    return Collections.emptyList();
  }

  public int docCount() {
    return 0;
  }

  public double avgDocLength() {
    return 0.0;
  }

  public int docLength(int docId) {
    return 0;
  }
}
