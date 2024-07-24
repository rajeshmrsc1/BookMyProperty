package com.example.BookMyProperty.Services;

import java.util.List;

import com.example.BookMyProperty.Model.Sale;

public interface SaleiServices {

	public Sale SaveNewSale(Sale sal);

	List<Sale> FindAllSale();

	public Sale FindById(Long saleId);

	public void DeleteSaleById(Long saleId);

}
