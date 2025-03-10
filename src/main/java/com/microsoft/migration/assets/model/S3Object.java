package com.microsoft.migration.assets.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class S3Object {
    private String key;
    private String name;
    private long size;
    private Instant lastModified;
    private String url;
}