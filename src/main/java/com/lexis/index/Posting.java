package com.lexis.index;

import java.util.List;

public record Posting(int docId, int tf, List<Integer> positions) {}
