package com.example.BookMyProperty.Services;

import java.util.List;

import com.example.BookMyProperty.Model.Buyer;

public interface BuyeriServices {

	public Buyer SaveNewBuyer(Buyer buy);

	List<Buyer> FindAllBuyer();

	public Buyer FindById(Long BuyerId);

	public void DeleteBuyerById(Long BuyerId);

}
