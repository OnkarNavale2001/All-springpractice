package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.beans.Userdetails;
@Repository
public interface userrepo  extends JpaRepository<Userdetails, Integer>{
    
}
