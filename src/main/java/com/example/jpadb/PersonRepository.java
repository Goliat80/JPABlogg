package com.example.jpadb;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<persons, Integer> {
}
