package com.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.beans.Userdetails;
@Repository
public interface UserRepositry extends JpaRepository<Userdetails, Integer> {

}
