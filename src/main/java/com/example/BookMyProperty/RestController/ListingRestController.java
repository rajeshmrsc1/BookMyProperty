package com.example.BookMyProperty.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookMyProperty.Model.Listing;
import com.example.BookMyProperty.Services.ListingiServices;

@RestController
@RequestMapping(value = "/api/listing")
public class ListingRestController {

	@Autowired
	ListingiServices lis;

	@GetMapping
	public List<Listing> FindAllListing() {
		System.out.println("Get mapping run in RestController");
		return lis.FindAllListing();
	}

	@GetMapping(value = "/{ListingId}")
	public Listing FindById(@PathVariable Long ListingId) {
		System.out.println("Get mapping run with  ListingId in Restcontroller ");
		return lis.FindById(ListingId);
	}
	@PostMapping
	public Listing SaveNewListing(@RequestBody Listing list) {
		System.out.println("post mapping run  in Restcontroller ");
		return lis.SaveNewListing(list);	}
	
	
	
	
	@PutMapping(value = "/{ListingId}")
	public Listing updateListingDetailById(@RequestBody Listing list, @PathVariable Long ListingId) {
		list.setListingId(ListingId);
		System.out.println("put mapping run  in Restcontroller ");
		return lis.UpdateListingDetails(list);
	}
     @DeleteMapping(value="/{ListingId}")
	public void DeleteListingById(@PathVariable Long ListingId) {
		System.out.println(" Delete mapping run  in Restcontroller ");
	    lis.DeleteListingById(ListingId);
	}

	
	
	
}
