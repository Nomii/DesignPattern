package com.design.patterns.creational.builder;

public class UrlBuilder {

    public static class Builder {
        private String protocol;
        private String host;
        private String port;
        private String pathParams;
        private String queryParams;

        public Builder protocol(String protocol){
            this.protocol = protocol;
            return this;
        }
        public Builder host(String host){
            this.host = host;
            return this;
        }
        public Builder port(String port){
            this.port = port;
            return this;
        }
        public Builder pathParams(String pathParams){
            this.pathParams = pathParams;
            return this;
        }
        public Builder queryParams(String queryParams){
            this.queryParams = queryParams;
            return this;
        }
        public UrlBuilder build(){
            return new UrlBuilder(this);
        }
    }

    private final String protocol;
    private final String host;
    private final String port;
    private final String pathParams;
    private final String queryParams;

    private UrlBuilder(Builder builder){
        this.protocol = builder.protocol;
        this.host = builder.host;
        this.port = builder.port;
        this.pathParams = builder.pathParams;
        this.queryParams = builder.queryParams;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getPathParams() {
        return pathParams;
    }

    public String getQueryParams() {
        return queryParams;
    }

}
