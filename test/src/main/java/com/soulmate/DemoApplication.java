package com.soulmate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        SpringApplication.run(DemoApplication.class);
        System.out.println("ddddddddd");
        Test.md5();
    }
}
