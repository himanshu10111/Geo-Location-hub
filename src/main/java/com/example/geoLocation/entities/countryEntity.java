package com.example.geoLocation.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class countryEntity {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	
	@Column(name = "sortname")
    private String sortName;

    
    @Column(name = "name")
    private String name;
    
    @Column(name = "phonecode")
    private String phoneCode;

	public String getSortName() {
		return sortName;
	}


	public void setSortName(String sortName) {
		this.sortName = sortName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneCode() {
		return phoneCode;
	}


	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}


	@Override
	public String toString() {
		return "countryEntity [sortName=" + sortName + ", name=" + name + ", phoneCode=" + phoneCode + "]";
	}


	public countryEntity(String sortName, String name, String phoneCode) {
		super();
		this.sortName = sortName;
		this.name = name;
		this.phoneCode = phoneCode;
	}


	

	
	

}
