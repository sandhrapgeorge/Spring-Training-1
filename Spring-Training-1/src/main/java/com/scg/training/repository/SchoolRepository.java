package com.scg.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.scg.training.entity.School;

//, JpaSpecificationExecutor<School>
@Repository
public interface SchoolRepository extends JpaRepository<School, Integer>, JpaSpecificationExecutor<School> {

//	@Query("select s from School s where s.schoolName=:name")
//	School findSchoolByName(@Param("name") String name);

	School findBySchoolName(String name);

	// School findBySchoolName(String name) or findBySchoolid(int schoolid);

}
