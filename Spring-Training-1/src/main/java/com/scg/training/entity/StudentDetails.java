package com.scg.training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student_details")
@NoArgsConstructor
//@AllArgsConstructor
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String hobby;
	@OneToOne(mappedBy = "studentDetails")
	private Student student;

	public StudentDetails(final String hobby) {
		this.hobby = hobby;

	}
}
