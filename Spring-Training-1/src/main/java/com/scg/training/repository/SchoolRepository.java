package com.scg.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scg.training.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {

}
