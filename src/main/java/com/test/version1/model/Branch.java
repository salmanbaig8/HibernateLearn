package com.test.version1.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer branchId;
	private String name;
	@ManyToOne(cascade = CascadeType.ALL)
	private Town town;
	
	
}
