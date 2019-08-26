package ind.charlie.frameworkeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FrameworkEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameworkEurekaApplication.class, args);
    }

}
