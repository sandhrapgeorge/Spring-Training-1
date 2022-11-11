package com.scg.training.entity;

import java.util.List;

import javax.persistence.CascadeType;
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
	private int schoolid;
	private String schoolName;
	private String city;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "schoolid", referencedColumnName = "schoolid")
	private List<Student> student;

	public School(final String schoolname, final String city) {
		this.schoolName = schoolname;
		this.city = city;
	}

}
