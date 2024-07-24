package com.example.BookMyProperty.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "Property Infromation")


public class Property {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  PropertyId;

@Column()
	private String  PropertyType; //(e.g., Residential, Commercial)
	private String  PropertyAddress;
	private Long    Zipcode;
	private String  City;  
	private String  State;
	private Double  Size; 
    private Integer NumberOfBedrooms;
    private Integer NumberOfBathrooms;
	private Double  Price  ;
	private String status;  //(e.g., Available, Sold)
	
	@OneToOne(mappedBy = "property", cascade = CascadeType.ALL)
    private Listing listing;
	
	@OneToOne(mappedBy = "property", cascade = CascadeType.ALL)
    private Sale sale;
	
	
	
}
