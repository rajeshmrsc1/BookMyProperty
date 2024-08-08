package com.example.BookMyProperty.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyProperty.Model.Property;
import com.example.BookMyProperty.Repo.Propertyirepos;

@Service
public class PropertyServiceImpl implements PropertyiServices {

	@Autowired
	Propertyirepos propirepo;

	@Override
	public List<Property> findAllProperty() {

		System.out.println("All property record fetch from databases ");
		return propirepo.findAll();
	}

	@Override
	public Property getpropertyByPropertyId(Long PropertyId) {

		System.out.println(" property  find successfully for PropertyId ");
		return propirepo.findById(PropertyId).orElse(null);
	}

	@Override
	public Property SaveNewProperty(Property prop) {

		System.out.println("new Property  list  ");

		return propirepo.save(prop);

	}

	@Override
	public void DeletePropertyByPropertyId(Long PropertyId) {
		System.out.println(" property  deleted  successfully ");
		propirepo.deleteById(PropertyId);

	}

	@Override
	public Property UpdatePropertyDetails(Property prop) {
		System.out.println(" property  Updated  successfully ");
		return propirepo.save(prop);

	}

//	@Override
//	public Property UpdatePropertyDetailsById(Property prop, Integer id) {
//		Optional<Property> existingProperty = propirepo.findById(id);
//		if (existingProperty.isPresent()) {
//			Property p1 = existingProperty.get();
//			p1.setPropertyType(prop.getPropertyType();
//			p1.setPropertyAddress(prop.getPropertyAddress());
//			p1.setPrice(prop.getPrice());
//			p1.setSize(prop.getSize());
//			p1.setState(prop.getState());
//			p1.setStatus(prop.getStatus());
//			p1.setNumberOfBathrooms(prop.getNumberOfBathrooms());
//			p1.setNumberOfBedrooms(prop.getNumberOfBedrooms());
//			p1.setCity(prop.getCity());
//			p1.setZipcode(prop.getZipcode());
//			System.out.println("property record updated  successfully ");
//			return propirepo.save(prop);
//		} else {
//			throw new RuntimeException(" No Record Found ");
//

//	@Override
//	public Property UpdatePropertyDetails(Integer id ,Property prop) {
//		System.out.println("Property details updated successfully ");
//
//		return propirepo.save(prop);
//}

//	@Override
//	public Property getpropertyById(Long  PropertyId) {
//
//		Property p1 = propirepo.findById(PropertyId).get()
//		System.out.println(" property  find successfully ");
//		return p1 ;
//	

}
