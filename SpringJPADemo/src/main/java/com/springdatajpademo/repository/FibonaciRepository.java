package com.springdatajpademo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpademo.model.Fibonaci;


public interface FibonaciRepository extends JpaRepository<Fibonaci, Integer> {

	Optional<Fibonaci> findByInput(int input);

	

}
