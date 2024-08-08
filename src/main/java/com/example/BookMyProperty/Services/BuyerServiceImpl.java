package com.example.BookMyProperty.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyProperty.Model.Buyer;
import com.example.BookMyProperty.Repo.Buyerirepo;

@Service
public class BuyerServiceImpl implements BuyeriServices {

	@Autowired
	Buyerirepo brepo;

	@Override
	public Buyer SaveNewBuyer(Buyer buy) {
		System.out.println("New Buyer  Registred ");
		return brepo.save(buy);
	}

	@Override
	public List<Buyer> FindAllBuyer() {
		System.out.println("All Record Receive ");
		return brepo.findAll();
	}

	@Override
	public Buyer FindById(Long BuyerId) {
		System.out.println("BuyerId Record Receive  ");
		return brepo.findById(BuyerId).orElse(null);
	}

	@Override
	public void DeleteBuyerById(Long BuyerId) {
		System.out.println("BuyerId Record Deleted  ");
		brepo.deleteById(BuyerId);
	}

	@Override
	public Buyer UpdateBuyerDetails(Buyer buy) {
		System.out.println(" Buyer Detail Updated successfully ");
		return brepo.save(buy);
	}

}
