package com.miraclesoft.facilities.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.miraclesoft.facilities.entity.Facilities;

import reactor.core.publisher.Flux;

public interface  FacilitiesRepository extends ReactiveCrudRepository<Facilities, Integer> {

	Flux<Facilities> findByFirstName(String firstName);

    Flux<Facilities> findByLastName(String lastName);
}
