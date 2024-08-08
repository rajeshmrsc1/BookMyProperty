package com.example.BookMyProperty.Services;

import java.util.List;

import com.example.BookMyProperty.Model.Listing;

public interface ListingiServices {

	public Listing SaveNewListing(Listing lis);

	List<Listing > FindAllListing ();

	public Listing  FindById(Long ListingId);

	public void DeleteListingById(Long ListingId);

	public Listing UpdateListingDetails(Listing lis );
	
	
}
