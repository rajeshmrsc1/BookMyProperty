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

import com.example.BookMyProperty.Model.Sale;

import com.example.BookMyProperty.Services.SaleiServices;

@RestController
@RequestMapping("/api/sale")
public class SaleRestController {
	@Autowired
	SaleiServices sali;

	@GetMapping
	public List<Sale> FindAllSale() {
		System.out.println("Get mapping run in Sale restconroller ");
		return sali.FindAllSale();
	}

	@GetMapping(value = "/{saleId}")
	public Sale FindById(@PathVariable Long saleId) {
		System.out.println("Get mapping run in Sale restconroller ");
		return sali.FindById(saleId);
	}

	@PostMapping
	public Sale SaveNewSale(@RequestBody Sale sal) {
		System.out.println("Post mapping run in Sale restconroller ");
		return sali.SaveNewSale(sal);
	}
     @PutMapping(value = "/{saleId}")
	public Sale UpdateSaleDetail(@RequestBody Sale sal, @PathVariable Long saleId) {
		sal.setSaleID(saleId);
		System.out.println("Put mapping run in Sale restconroller ");
		return sali.SaveNewSale(sal);
	}
     @DeleteMapping(value = "/{saleId}")
	public void DeleteSaleById(@PathVariable Long saleId) {
		System.out.println("Delete  mapping run in Sale restconroller ");
		sali.DeleteSaleById(saleId);

	}

}
