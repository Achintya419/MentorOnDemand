package com.example.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "technology")
public class Technology extends AuditModel{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "tech_name", nullable = false)
	private String techName;
	
	@Column(name = "description", nullable = false)
	private String description;

//	@OneToMany(cascade=CascadeType.ALL, mappedBy="technology")
//	private List<Training> training;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	

//	public List<Training> getTraining() {
//		return training;
//	}
//
//	public void setTraining(List<Training> training) {
//		this.training = training;
//	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
