package com.scg.training.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "school")
@NoArgsConstructor
@AllArgsConstructor
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer schoolid;
	private String schoolName;
	private String city;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "schoolid", referencedColumnName = "schoolid")
	private List<Student> student;
	@Embedded
	Contact contact;

	public School(final String schoolName, final String city, final List<Student> student, final Contact contact) {
		this.schoolName = schoolName;
		this.city = city;
		this.student = student;
		this.contact = contact;
	}

}
