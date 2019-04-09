package com.src.ingtradeapp.respository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Users;
@Component
public interface LoginRepository extends JpaRepository<Users, Serializable>{
	
	public Users findByNameAndPassword(String name, String password);

}
