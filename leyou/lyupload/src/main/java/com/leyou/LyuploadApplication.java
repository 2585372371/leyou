package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 25853
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LyuploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyuploadApplication.class);
    }
}
