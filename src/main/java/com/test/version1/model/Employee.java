package com.test.version1.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String position;
	@Column(unique = true)
	private EmployeeCard card;
	@ManyToOne(cascade = CascadeType.ALL)
	private Branch branch;
}
