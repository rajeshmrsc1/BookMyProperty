package com.example.BookMyProperty.Services;

import java.util.List;

import com.example.BookMyProperty.Model.Property;

public interface PropertyiServices {
    
	Property SaveNewProperty(Property prop);
	List<Property>getAllProperty();
	
	
}
