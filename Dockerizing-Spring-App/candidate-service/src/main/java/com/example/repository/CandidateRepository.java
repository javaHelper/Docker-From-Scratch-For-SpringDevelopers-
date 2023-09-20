package com.example.repository;

import com.example.entity.Candidate;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CandidateRepository extends ReactiveCrudRepository<Candidate, String> {
}