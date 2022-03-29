package com.application.hire.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.application.hire.entities.Interviewer;

public interface Interviewer_Repository extends CrudRepository<Interviewer,String> {

	Optional<Interviewer> findByuserId(int id);
	void deleteByuserId(int id);
}