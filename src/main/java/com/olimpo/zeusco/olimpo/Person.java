package com.olimpo.zeusco.olimpo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//apply the ruight comments
@Entity
@Table
class Person {
	@Id
	@GeneratedValue
	Integer id;
	
	@Column
	String name;
	
	@Column
	Integer age;
}