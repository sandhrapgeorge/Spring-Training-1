package com.scg.training.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "school")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer schoolid;
	@Column(name = "school_name", unique = true)
	private String schoolName;
	private String city;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "schoolid")
	// referencedColumnName = "schoolid"
	private List<Student> student;
	@Embedded
	Contact contact;

}
