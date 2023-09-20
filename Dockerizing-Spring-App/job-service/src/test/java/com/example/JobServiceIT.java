package com.example;

import com.example.dto.JobDto;
import com.example.generic.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/**
 * If running command line -> mvn clean verify
 */

@SpringBootTest
@AutoConfigureWebTestClient
public class JobServiceIT extends BaseTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void allJobsTest() {
        this.webTestClient.get()
                .uri("/job/all")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody()
                .consumeWith(e -> System.out.println(new String(Objects.requireNonNull(e.getResponseBody()))))
                .jsonPath("$").isNotEmpty();
    }

    @Test
    public void searchBySkillsTest() {
        this.webTestClient.get()
                .uri("/job/search?skills=java")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody()
                .jsonPath("$.size()").isEqualTo(3);
    }

    @Test
    public void postJobTest() {
        var dto = JobDto.create(null, "k8s engr", "google", Set.of("k8s"), 200000, true, null);
        this.webTestClient.post()
                .uri("/job")
                .bodyValue(dto)
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody()
                .jsonPath("$.id").isNotEmpty()
                .jsonPath("$.description").isEqualTo("k8s engr");
    }
}