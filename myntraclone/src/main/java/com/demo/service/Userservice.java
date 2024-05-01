package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.beans.Userdetails;
import com.demo.repositry.UserRepositry;

@Service
public class Userservice {
    @Autowired
	UserRepositry repo;
    @Autowired
    private PasswordEncoder passwordEncoder;
   public boolean saveuser(Userdetails u)
   {
	   boolean b = false;
		try {
			u.setPassword(passwordEncoder.encode(u.getPassword()));
			 repo.save(u);
			return b = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return b;
		}
   }
   
}
