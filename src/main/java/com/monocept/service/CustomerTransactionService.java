package com.monocept.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.CustomerTransaction;
import com.monocept.model.dto.CustomerTransactionDto;
import com.monocept.repository.CustomerTransactionRepository;

@Service
public class CustomerTransactionService {
	@Autowired
	private CustomerTransactionRepository repo;
	
	public String addTransaction(CustomerTransaction transaction) {
		return repo.addTransaction(transaction);
	}
	
	public List<CustomerTransactionDto> getCustomerTransactions(){
		return repo.getCustomerTransactions().stream().map(t-> new CustomerTransactionDto(t.getId(), t.getCustomer().getName(), t.getTime(), t.getDescription(), t.getAmount(), t.getType())).collect(Collectors.toList());
	}
}
