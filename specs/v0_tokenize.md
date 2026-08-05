# LEXIS Stage 0 — Tokenizer

Status: **frozen**. Language: **Java**.

## Purpose

Normalize and tokenize UTF-8 text into terms.

## Required

- Lowercase
- Split on non-alphanumeric (document policy)
- Optional stop-word list hook
- Stable term IDs later assigned by indexer

## API

`List<String> tokenize(String text)`
