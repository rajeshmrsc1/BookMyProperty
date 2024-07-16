package com.example.BookMyProperty.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyProperty.Model.Property;
import com.example.BookMyProperty.Repo.Propertyirepos;

@Service
public class PropertyserviceImpl implements PropertyiServices {

	@Autowired
	Propertyirepos propirepo;

	@Override
	public Property SaveNewProperty(Property prop) {

		System.out.println("new Property  list ");

		return propirepo.save(prop);

	}

	@Override
	public List<Property> getAllProperty() {

		System.out.println("All property record fetch from databases ");
		return propirepo.findAll();
	}

}
