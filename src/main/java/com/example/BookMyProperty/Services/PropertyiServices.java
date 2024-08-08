package com.example.BookMyProperty.Services;

import java.util.List;

import com.example.BookMyProperty.Model.Property;

public interface PropertyiServices {

	// use crud operation for property entity

	public Property SaveNewProperty(Property prop);

	List<Property> findAllProperty();

	public Property getpropertyByPropertyId(Long  PropertyId);

	public void DeletePropertyByPropertyId(Long  PropertyId);

  public Property UpdatePropertyDetails(Property prop);

  
  
  
  // public Property UpdatePropertyDetailsById(Property prop, Integer id);
//	List<Property> getpropertyByPropertyAddress(String PropertyAddress);
//	List<Property> getpropertyByCity(String City,);

}
