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
@Table(name = "Agent Detail ")

public class Agent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AgentId;
	@Column
	private String AgentName;
	private String PhoneNo;
	private String Email;

	@OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
	private List<Listing> listings;

	@OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
	private List<Sale> sales;

}
