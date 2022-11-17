package com.scg.training.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student_details")
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @GeneratedValue(strategy = GenerationType.AUTO, generator =
	// "student_generator")
	// @SequenceGenerator(name = "student_generator", initialValue = 1,
	// allocationSize = 2, sequenceName = "student_hibernate1")
	private Integer studentDetailsId;
	// @Column(name = "student_hobby", length = 50, nullable = false, unique = true)
	private String hobby;
	private Double weight;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "studentDetailsId")
	@JsonIgnore
	Student student;
}
