package cn.ctcc.admineurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AdminEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminEurekaServerApplication.class, args);
    }

}
