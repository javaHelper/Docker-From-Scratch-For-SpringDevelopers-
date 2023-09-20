package com.example.repository;

import com.example.entity.Job;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.util.Set;

public interface JobRepository extends ReactiveCrudRepository<Job, String> {
    Flux<Job> findBySkillsIn(Set<String> skills);
}