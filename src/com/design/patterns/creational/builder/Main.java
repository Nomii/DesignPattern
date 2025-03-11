package com.design.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        UrlBuilder.Builder builder = new UrlBuilder.Builder();
        // Adding small objects to a large object using builder pattern
        builder.protocol("https").host("localhost").port("8080");
        UrlBuilder urlBuilder = builder.build();
        System.out.println(urlBuilder.getProtocol() + "://" + urlBuilder.getHost() + ":" + urlBuilder.getPort());

        UrlBuilder.Builder builder2 = new UrlBuilder.Builder();
        // Adding small objects to a large object using builder pattern
        builder2.protocol("https").host("localhost").port("8080").pathParams("companies").queryParams("name=google");
        UrlBuilder urlBuilder2 = builder2.build();
        System.out.println(urlBuilder2.getProtocol() + "://" + urlBuilder2.getHost() + ":" + urlBuilder2.getPort() + "/" + urlBuilder2.getPathParams() + "?" + urlBuilder2.getQueryParams());
    }
}
