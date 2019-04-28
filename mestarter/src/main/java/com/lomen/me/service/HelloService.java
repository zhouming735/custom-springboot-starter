package com.lomen.me.service;

import lombok.Getter;
import lombok.Setter;

public class HelloService {
    @Getter
    @Setter
    private String msg;

    public String sayHello(){
        return "Hello "+msg;
    }
}
