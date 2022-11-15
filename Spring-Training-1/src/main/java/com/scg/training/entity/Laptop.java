package com.scg.training.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Laptop")
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer laptopid;
	private String laptopName;

	public Laptop(final String laptopName) {
		this.laptopName = laptopName;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id", referencedColumnName = "studentid")
	private Student student;

}
