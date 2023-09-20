package com.example.util;

import com.example.dto.JobDto;
import com.example.entity.Job;
import org.springframework.beans.BeanUtils;

public class EntityDtoUtil {
    public static JobDto toDto(Job job) {
        JobDto dto = new JobDto();
        BeanUtils.copyProperties(job, dto);
        return dto;
    }

    public static Job toEntity(JobDto dto) {
        Job job = new Job();
        BeanUtils.copyProperties(dto, job);
        return job;
    }
}