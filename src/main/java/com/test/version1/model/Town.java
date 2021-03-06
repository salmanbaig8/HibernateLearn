package com.test.version1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Town {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer townId;
	private String name;
	private Integer population;
	
}
