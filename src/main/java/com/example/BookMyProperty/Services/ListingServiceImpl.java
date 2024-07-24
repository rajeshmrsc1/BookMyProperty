package com.example.BookMyProperty.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyProperty.Model.Listing;
import com.example.BookMyProperty.Repo.Listingirepos;
@Service
public class ListingServiceImpl implements ListingiServices {

	@Autowired
	Listingirepos lsrp ;
	
	
	
	@Override
	public Listing SaveNewListing(Listing lis) {
		System.out.println("new Listing list ");
		return lsrp.save(lis);
	}

	@Override
	public List<Listing> FindAllListing() {
		System.out.println("All Listed  Property list fetch ");
		return lsrp.findAll();
	}

	@Override
	public Listing FindById(Long ListingId) {
		System.out.println(" ListingId   Property Record fetch ");
		return lsrp.findById(ListingId).orElse(null);
	}

	@Override
	public void DeleteListingById(Long ListingId) {
		System.out.println(" ListingId   Property Record Deleted ");
	    lsrp.deleteById(ListingId);
	}

	
	
	
	
}
