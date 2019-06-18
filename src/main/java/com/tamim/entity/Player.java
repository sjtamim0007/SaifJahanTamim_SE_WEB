package com.tamim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "player")
public class Player {

	// primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotNull(message = "name field can not be empty")
	@Size(min = 1, message = "name field can not be empty")
	@Column(name = "name")
	private String name;

	@NotNull(message = "Country field can not be empty")
	@Size(min = 1, message = "Country field can not be empty")
	@Column(name = "country")
	private String country;


	@NotNull(message = "role field can not be empty")
	@Size(min = 1, message = "role field can not be empty")
	@Column(name = "role")
	private String role;

	@NotNull(message = "dateOfBirth field can not be empty")
	@Size(min = 1, message = "dateOfBirth field can not be empty")
	@Column(name = "dateOfBirth")
	private String dateOfBirth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
