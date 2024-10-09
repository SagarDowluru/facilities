package com.miraclesoft.facilities.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miraclesoft.facilities.entity.Facilities;
import com.miraclesoft.facilities.service.FecilitiesService;

import reactor.core.publisher.Flux;

@RestController
public class FacilitiesController {

	private final FecilitiesService fecilitiesService;

    public FacilitiesController(FecilitiesService fecilitiesService) {
        this.fecilitiesService = fecilitiesService;
    }

    @GetMapping("/actors")
    public Flux<Facilities> getAllActors() {
        return fecilitiesService.getAllActors();
    }
	
}
