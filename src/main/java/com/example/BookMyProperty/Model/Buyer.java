package com.example.BookMyProperty.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Buyer Detail")

public class Buyer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long BuyerID;

	@Column
	private String Name;
	private String PhoneNumber;
	private String Email;
	@OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL)
    private List<Sale> sales;
	

}
