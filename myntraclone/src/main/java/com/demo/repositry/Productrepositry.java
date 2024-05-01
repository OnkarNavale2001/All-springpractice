package com.demo.repositry;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.demo.beans.Productdetails;

public interface Productrepositry extends JpaRepository<Productdetails, Integer> {
	   @Query("SELECT pd FROM Productdetails pd")
	    List<Productdetails> findAllProductsWithImagesAndSizes();
        void  delete(Productdetails p) ; 
        @Query(value = "SELECT * FROM products WHERE product_category='Men' LIMIT 4", nativeQuery = true)
        List<Productdetails> findTop4ByCategory();
        @Query(value = "SELECT * FROM products WHERE product_category='Women' LIMIT 4", nativeQuery = true)
        List<Productdetails> findTopWByCategory();
      
        
}
