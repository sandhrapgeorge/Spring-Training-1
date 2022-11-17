package com.scg.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.scg.training.entity.Student;

@Repository
//@Component
//extends JpaRepository<Student, Integer>
//@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query(value = "selec * from student where studentid=:id", nativeQuery = true)
	Student findByStudentid(int id);
//	@Query(value = "select * from student where studentname=:studentname", nativeQuery = true)

	// List<Student> findStudentByName(@Param("studentname") String studentName);
//	@Query("SELECT s FROM Student s WHERE s.name=:studentname")
//	List<Student> findStudentByName(@Param("studentname") String studentName);

	List<Student> findStudentByName(String name);

	// List<String> getSchoolByStudentById(int id);

}
///added new comment
//The @Query annotation takes precedence over named queries, which are annotated with @NamedQuery or defined in an orm.xml file.