package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {

    private String url;
    private String userName;
    private String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUserName() {
        return userName;
    }

    public String getKey() {
        return key;
    }
}
