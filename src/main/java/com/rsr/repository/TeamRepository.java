package com.rsr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsr.model.Players;

@Repository
public interface TeamRepository extends JpaRepository<Players, Long>{

}
