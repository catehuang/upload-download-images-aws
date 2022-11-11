package com.example.demo.bucket;

public enum BucketName {

    PROFILE_IMAGE("spring-aws-learning");

    private final String bucketName;

    BucketName(String buketName) {
        this.bucketName = buketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
