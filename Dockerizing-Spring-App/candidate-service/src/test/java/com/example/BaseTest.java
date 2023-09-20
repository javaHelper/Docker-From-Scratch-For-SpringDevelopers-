package com.example;

import org.junit.ClassRule;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.File;

@Testcontainers
public abstract class BaseTest {

    public static final int MONGO_PORT = 27017;
    public static final String MONGO = "mongo";
    public static final String MONGO_URI = "mongodb://candidate_user:candidate_password@%s:%s/candidate";

    @ClassRule
    public static final DockerComposeContainer<?> compose = new DockerComposeContainer<>(new File("docker-compose.yaml"));

    @DynamicPropertySource
    static void mongoProperties(DynamicPropertyRegistry registry) {
        compose.withEnv("HOST_PORT", "0")
                .withExposedService(MONGO, MONGO_PORT, Wait.forListeningPort())
                .start();

        String host = compose.getServiceHost(MONGO, MONGO_PORT);
        Integer port = compose.getServicePort(MONGO, MONGO_PORT);
        registry.add("spring.data.mongodb.uri", () -> String.format(MONGO_URI, host, port));
    }
}