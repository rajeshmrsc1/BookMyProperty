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

import com.example.BookMyProperty.Model.Property;
import com.example.BookMyProperty.Services.PropertyiServices;

@RestController
@RequestMapping("/api/property")
public class PropertyRestController {

	@Autowired
	PropertyiServices propiserv;

	@GetMapping
	public List<Property> findAllProperty() {

		System.out.println("RestController running with Get mapping ");
		return propiserv.findAllProperty();
	}

	@GetMapping(value = "/{PropertyId}")
	public Property getpropertyById(@PathVariable Long  PropertyId) {
		System.out.println("RestController running with Get mapping ");
		return propiserv.getpropertyByPropertyId(PropertyId);

	}

	@PostMapping
	public Property SaveNewProperty(@RequestBody Property prop) {

		System.out.println("RestController running with post mapping ");

		return propiserv.SaveNewProperty(prop);
	}

	
	@PutMapping(value = "/{PropertyId}")
	public Property UpdatePropertyDetailsById(@RequestBody Property prop, @PathVariable Long  PropertyId) {
		prop.setPropertyId(PropertyId);
		System.out.println(" RestController running with put mapping url  ");
		return propiserv.UpdatePropertyDetails(prop);

	}

	@DeleteMapping(value = "/{PropertyId}")
	public void DeletePropertyById(@PathVariable Long PropertyId) {

		System.out.println("Rest Controller is running with  DeleteById mapping   url ");

		propiserv.DeletePropertyByPropertyId(PropertyId);

	}

}
