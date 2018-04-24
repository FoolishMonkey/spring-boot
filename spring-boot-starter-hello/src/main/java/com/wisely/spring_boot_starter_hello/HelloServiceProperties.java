package com.wisely.spring_boot_starter_hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="hello")
@SpringBootApplication
public class HelloServiceProperties {
	private static final String MSG = "world";
	private String msg = MSG;

    public static String getMSG() {
        return MSG;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceProperties.class, args);

    }
}
