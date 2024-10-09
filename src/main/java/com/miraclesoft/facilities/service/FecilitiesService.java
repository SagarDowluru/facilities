package com.miraclesoft.facilities.service;

import org.springframework.stereotype.Service;

import com.miraclesoft.facilities.entity.Facilities;
import com.miraclesoft.facilities.repository.FacilitiesRepository;

import reactor.core.publisher.Flux;

@Service
public class FecilitiesService {

	private final FacilitiesRepository facilitiesRepository;

    public FecilitiesService(FacilitiesRepository facilitiesRepository) {
        this.facilitiesRepository = facilitiesRepository;
    }

    public Flux<Facilities> getAllActors() {
        return facilitiesRepository.findAll();
    }
}
