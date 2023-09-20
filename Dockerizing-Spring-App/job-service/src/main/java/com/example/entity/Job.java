package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
@Document
public class Job {
    @Id
    private String id;
    private String description;
    private String company;
    private List<String> skills;
    private Integer salary;
    private boolean isRemote;
}