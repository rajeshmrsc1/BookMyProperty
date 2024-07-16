package com.example.BookMyProperty.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "Property Infromation")


public class Property {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

@Column()
	private String  propertyId;
	private String  propertyType; //(e.g., Residential, Commercial)
	private String  address;
	private String  zipcode;
	private String  city;  
	private String  state;
	private Double  size; 
    private Integer numberOfBedrooms;
    private Integer numberOfBathrooms;
	private Double  price  ;
	private String status;  //(e.g., Available, Sold)
	
	
	
	
	
	
	
}
