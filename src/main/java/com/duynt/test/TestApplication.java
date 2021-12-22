package com.duynt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TestApplication.class);

        ConfigurableEnvironment environment = new StandardEnvironment();
        String profile = System.getenv("DUYNT_PROF");
        System.out.println("DUYNT_PROF: " + profile);
        System.getenv().forEach((key, value) -> System.out.println(key + ": " + value));
        if (profile == null || profile.isEmpty())
            profile = "dev";
        environment.setActiveProfiles(profile);
        application.setEnvironment(environment);

        application.run(args);
    }

}
