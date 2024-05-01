package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Productdetails;
import com.demo.repositry.Productrepositry;

@Service
public class productservice {
	@Autowired
	Productrepositry repo;

	public void savedata(Productdetails p) {
		repo.save(p);
	}

	public List<Productdetails> getall() {
		return repo.findAllProductsWithImagesAndSizes();
	}

	public void delete(Productdetails p) {
		repo.delete(p);
	}

	public Productdetails getbyid(int id) {
		return repo.findById(id).get();
	}

	public void updateproducts(Productdetails p) {
		repo.save(p);
	}

	 public List<Productdetails> products()
	 {
		 return repo.findTop4ByCategory();
	 }
	 public List<Productdetails> productswo()
	 {
		 return repo.findTopWByCategory();
	 }
}    

