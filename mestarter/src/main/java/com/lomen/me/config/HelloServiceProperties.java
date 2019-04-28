package com.lomen.me.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="me")
@Getter
@Setter
public class HelloServiceProperties {
    private static final String MSG = "world";
    private String msg = MSG;
}
