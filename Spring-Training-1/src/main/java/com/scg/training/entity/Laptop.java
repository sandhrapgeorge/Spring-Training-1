package com.scg.training.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Laptop")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int laptopid;
	private String laptopName;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "studentid")
	// @JsonIgnore
	private Student student;

}
