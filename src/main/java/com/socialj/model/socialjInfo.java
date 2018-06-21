package com.socialj.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="socialjinfo")
public class socialjinfo implements Serializable{
//model for socialj app info	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	public socialjinfo() {}
	
	public socialjinfo(String title, String description) {
		super();
		this.title=title;
		this.description=description;
	}
	
	public void setTitle() {
		this.title=title;
	}
	
	public String getTitle(String title) {
		return title;
	}
	
	public void setDescription() {
		this.description=description;
	}
	
	public String getDescription(String description) {
		return description;
	}
}
