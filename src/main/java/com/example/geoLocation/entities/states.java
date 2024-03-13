package com.example.geoLocation.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "states")
public class states {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "Country_Id")
	    private countryEntity country;


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public countryEntity getCountry() {
			return country;
		}


		public void setCountry(countryEntity country) {
			this.country = country;
		}


		@Override
		public String toString() {
			return "states [id=" + id + ", name=" + name + ", country=" + country + "]";
		}
	    
	    


}
