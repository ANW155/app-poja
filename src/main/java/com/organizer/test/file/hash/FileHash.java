package com.organizer.test.file.hash;

import com.organizer.test.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
