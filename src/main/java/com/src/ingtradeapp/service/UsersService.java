package com.src.ingtradeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.model.UsersBalance;
import com.src.ingtradeapp.respository.UserBalanceRepo;
import com.src.ingtradeapp.respository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	UsersRepository  usersRepository;
	
	@Autowired
	UserBalanceRepo  userBalanceRepo;
	
	public Users userDetails(String accNum) {
		return usersRepository.findByAccountNumber(accNum); 
	}
	
	public List<Users> getUsers() {
		return usersRepository.findAll();
	}

	public UsersBalance getBalance(String accountNumber) {

		return userBalanceRepo.findByAccountNumber(accountNumber);

	}
}
