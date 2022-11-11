package com.scg.training.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
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
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
//@NamedQueries({ @NamedQuery(name = "Student.findStudentByName", query = "from Student where name = ?1") })
//@NamedNativeQuery(name="carkey",query="select id as id,name as name,length as length,width as width,length*width as area from Car", resultSetMapping="carkey")
@NamedNativeQuery(name = "Student.findStudentByName", query = "select * from student where studentname=?", resultClass = Student.class)
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// @GeneratedValue(strategy = GenerationType.AUTO, generator =
	// "student_generator")
	// @SequenceGenerator(name = "student_generator", initialValue = 1,
	// allocationSize = 2, sequenceName = "student_hibernate1")
	private int studentid;
	@Column(name = "studentname", length = 50, nullable = false, unique = true)
	private String name;
	@Enumerated(EnumType.ORDINAL)
	private Gender gender;

	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	@Column(name = "updated_at", insertable = false)
	private LocalDateTime updatedAt;

	@OneToOne
	@JoinColumn(name = "student_details_id")
	StudentDetails studentDetails;

	@OneToMany(targetEntity = Laptop.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "student_id", referencedColumnName = "studentid")
	private List<Laptop> laptop;
//cascade types: ALL
//	PERSIST
//	MERGE
//	REMOVE
//	REFRESH
//	DETACH
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "schoolid")
	private School school;

	@Embedded
	private Address address;

	public void setLaptop(final List<Laptop> l1) {
		// TODO Auto-generated method stub
		this.laptop = l1;

	}

	public Student(final String name, final StudentDetails studentDetails, final Address address) {
		this.name = name;
		this.studentDetails = studentDetails;
		this.address = address;
		// int age = age;
	}

	@PrePersist
	public void logNewUserAttempt() {
		log.info("Attempting to add new user with username: " + name);
		System.out.println("new user is adding to the datase");
		this.setName("hari");
	}

	@PostPersist
	public void logNewUserAdded() {
		log.info("Added user '" + name + "' with ID: " + studentid);
		System.out.println("new user is added to the datase..");
	}

	@PreRemove
	public void logUserRemovalAttempt() {
		log.info("Attempting to delete user: " + name);
	}

	@PostRemove
	public void logUserRemoval() {
		log.info("Deleted user: " + name);
	}

	@PreUpdate
	public void logUserUpdateAttempt() {
		log.info("Attempting to update user: " + name);
	}

	@PostUpdate
	public void logUserUpdate() {
		log.info("Updated user: " + name);
	}

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
