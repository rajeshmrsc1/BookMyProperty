package com.example.BookMyProperty.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyProperty.Model.Sale;
import com.example.BookMyProperty.Repo.Saleirepo;

@Service
public class SaleServiceImpl implements SaleiServices {
	@Autowired
	Saleirepo sirepo;

	@Override
	public Sale SaveNewSale(Sale sal) {
		System.out.println("new sale Registred ");
		return sirepo.save(sal);

	}

	@Override
	public List<Sale> FindAllSale() {
		System.out.println("All sale record fetch ");
		return sirepo.findAll();
	}

	@Override
	public Sale FindById(Long saleId) {
		System.out.println(" saleID record fetch ");
		return sirepo.findById(saleId).orElse(null);
	}

	@Override
	public void DeleteSaleById(Long saleId) {
		System.out.println(" saleID record Deleted Syuccessfully ");
		sirepo.deleteById(saleId);
	}

}
