package com.company.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "table_name")
@Getter
@Setter
public class Entity1   {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	Long id;
	
	@Column(name = "field1")	
	String field1;
	
	@Column(name = "field2")	
	Double field2;
	
	
	@Column(name = "created_at")	
	Date createdAT = new Date();

	
	
}
