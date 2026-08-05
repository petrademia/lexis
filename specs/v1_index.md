# LEXIS Stage 1 — Inverted index

Status: **frozen**.

## Purpose

Build posting lists: term → list of (docId, tf, optional positions).

## Required

- `addDocument(docId, text)`
- `postings(term) -> PostingList`
- Persist optional; in-memory OK for Stage 1
- Compression hook (Varbyte) can be Stage 1.5

## Forbidden

- Embedding Lucene/Elasticsearch as the index
