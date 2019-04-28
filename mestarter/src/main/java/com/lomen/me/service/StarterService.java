package com.lomen.me.service;

public class StarterService {
    private String config;

    public StarterService(String config) {
        this.config = config;
    }

    public String[] split(String separatorChar) {
        return this.config.split(separatorChar);
        //return StringUtils.split(this.config, separatorChar);
    }
}
