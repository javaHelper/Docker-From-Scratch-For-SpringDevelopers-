package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CandidateDto;
import com.example.repository.CandidateRepository;
import com.example.util.EntityDtoUtil;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository repository;

    public Flux<CandidateDto> all(){
        return this.repository.findAll()
                .map(EntityDtoUtil::toDto);
    }

    public Mono<CandidateDto> getById(String id){
        return this.repository.findById(id)
                .map(EntityDtoUtil::toDto);
    }
    
    public Mono<CandidateDto> save(Mono<CandidateDto> mono){
    	return mono
    			.map(EntityDtoUtil::toEntity)
    			.flatMap(repository::save)
    			.map(EntityDtoUtil::toDto);
    }
}