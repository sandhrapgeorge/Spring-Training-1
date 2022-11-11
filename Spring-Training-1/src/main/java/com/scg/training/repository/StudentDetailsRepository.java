package com.scg.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scg.training.entity.StudentDetails;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Integer> {

}
