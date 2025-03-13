package com.microsoft.migration.assets.worker.config;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsS3Config {
    @Value("${azure.blob.endpoint}")
    private String endpoint;

    @Bean
    public BlobServiceClient blobServiceClient() {
        return new BlobServiceClientBuilder()
                .endpoint(endpoint)
                .credential(new DefaultAzureCredentialBuilder().build())
                .buildClient();
    }
}
