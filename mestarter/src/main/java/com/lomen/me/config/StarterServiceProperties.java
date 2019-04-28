package com.lomen.me.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("lomen.service")
@Getter
@Setter
public class StarterServiceProperties {
    private String config;
}
