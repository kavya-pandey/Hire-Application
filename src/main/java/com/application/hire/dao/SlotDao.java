package com.application.hire.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.hire.entities.Slot;

public interface SlotDao extends JpaRepository<Slot, Integer> {

}
