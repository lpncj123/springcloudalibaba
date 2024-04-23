package cn.lp.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class DemoMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMemberApplication.class, args);
    }

}
