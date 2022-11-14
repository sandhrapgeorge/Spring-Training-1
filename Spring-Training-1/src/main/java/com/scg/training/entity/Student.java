package com.scg.training.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
//@NamedQueries({ @NamedQuery(name = "Student.findStudentByName", query = "from Student where name = ?1") })

@NamedNativeQuery(name = "Student.findStudentByName", query = "select * from student where studentname=?", resultClass = Student.class)
@EntityListeners(CustomAuditListener.class)
public class Student extends Audit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// @GeneratedValue(strategy = GenerationType.AUTO, generator =
	// "student_generator")
	// @SequenceGenerator(name = "student_generator", initialValue = 1,
	// allocationSize = 2, sequenceName = "student_hibernate1")
	private int studentid;
	@Column(name = "studentname", length = 50, nullable = false, unique = true)
	private String studentName;
	@Enumerated(EnumType.ORDINAL)
	private Gender gender;

//	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name = "studentid")
	@OneToOne(targetEntity = StudentDetails.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "studentid")
	StudentDetails studentDetails;

	@OneToMany(targetEntity = Laptop.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "student_id", referencedColumnName = "studentid")
	@JsonIgnoreProperties("student")
	private List<Laptop> laptop;
//cascade types: ALL
//	PERSIST
//	MERGE
//	REMOVE
//	REFRESH
//	DETACH

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "schoolid")
	@JsonIgnoreProperties("student")
	private School school;

	public Student(final String studentName, final Gender gender, final StudentDetails studentDetails,
			final List<Laptop> laptop, final School school) {
		this.studentName = studentName;
		this.gender = gender;
		this.studentDetails = studentDetails;
		this.laptop = laptop;
		this.school = school;
	}

//	public void setLaptop(final List<Laptop> l1) {
//		// TODO Auto-generated method stub
//		this.laptop = l1;
//
//	}

}

//JPA( Java Persistence API) is a specification which specifies how to access, manage and
//persist information/data between java objects and relational databases.
//if we have class and we would like to store the  data in the database, then we can make use of Jpa
//so we need use entity annotation in class so that JPA is aware of the class.
//we must specify it in class level
//we can use @Enity(name=""),The entity name defaults to the name of the class
//the name of the table in the database and the name of the entity won't be the same.
//In these cases, we can specify the table name using the @Table annotation:
//We can also mention the schema using the schema element:
//@id:Each JPA entity must have a primary key that uniquely identifies it. The @Id annotation defines the primary key.
//We can generate the identifiers in different ways, which are specified by the @GeneratedValue annotation.
// The value can be AUTO, TABLE, SEQUENCE, or IDENTITY:
