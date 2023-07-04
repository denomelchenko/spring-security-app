package com.denomelchenko.spring.security.repositories;

import com.denomelchenko.spring.security.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    public Optional<Person> findByUsername(String username);
}
