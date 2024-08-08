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

import com.example.BookMyProperty.Model.Buyer;
import com.example.BookMyProperty.Services.BuyeriServices;

@RestController
@RequestMapping("/api/buyer")
public class BuyerRestController {
	@Autowired

	BuyeriServices biserv;

	@GetMapping
	public List<Buyer> FindAllBuyer() {
		System.out.println("Get mapping running in BuyerRestController ");
		return biserv.FindAllBuyer();
	}

	@GetMapping(value = "/{BuyerId}")
	public Buyer FindById(@PathVariable Long BuyerId) {
		System.out.println("Get mapping running in BuyerRestController ");
		return biserv.FindById(BuyerId);
	}

	@PostMapping
	public Buyer SaveNewBuyer(@RequestBody Buyer buy) {
		System.out.println("Postmapping running in BuyerRestController");
		return biserv.SaveNewBuyer(buy);
	}

	@PutMapping(value = "/{Buyerid}")
	public Buyer UpdateBuyerDetail(@RequestBody Buyer buy, @PathVariable Long Buyerid) {
		System.out.println("Put mapping running in BuyerRestController");
		buy.setBuyerID(Buyerid);
		return biserv.UpdateBuyerDetails(buy);
	}

	@DeleteMapping(value = "/{BuyerId}")
	public void DeleteBuyerById(@PathVariable Long BuyerId) {
		System.out.println("Delete mapping running in BuyerRestController");
		biserv.DeleteBuyerById(BuyerId);
	}

}
