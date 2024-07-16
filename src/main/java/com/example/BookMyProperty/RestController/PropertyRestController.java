package com.example.BookMyProperty.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookMyProperty.Model.Property;
import com.example.BookMyProperty.Services.PropertyiServices;

@RestController
public class PropertyRestController {
      
	@Autowired
	PropertyiServices propiserv ;
	
	
	@GetMapping(value = "/getall")
	public List<Property> getAllProperty() {

		System.out.println("RestController running with Get mapping ");
		return propiserv.getAllProperty();
	}
	
	@PostMapping(value = "/add")
	public Property SaveNewProperty(@RequestBody Property prop) {
		
		System.out.println("RestController running with post mapping ");
		
		return propiserv.SaveNewProperty(prop);
   }	
	
	
}
