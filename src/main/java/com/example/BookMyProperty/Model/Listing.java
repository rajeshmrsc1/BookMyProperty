package com.example.BookMyProperty.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name = "Listing Details")

public class Listing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long listingId;
	@Temporal(TemporalType.DATE)
	private Date dateListed;
	private Long price;

	@OneToOne
	@JoinColumn(name = "property_id")
	private Property property;

	@ManyToOne
	@JoinColumn(name = "agent_id")
	private Agent agent;

}
