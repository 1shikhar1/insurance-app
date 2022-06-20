package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.CustomerTransaction;
import com.monocept.model.dto.CustomerTransactionDto;
import com.monocept.service.CustomerTransactionService;

@RestController
@RequestMapping("/api/v1/customerTransaction")
public class CustomerTransactionController {
	@Autowired
	private CustomerTransactionService service;
	
	@GetMapping
	public ResponseEntity<List<CustomerTransactionDto>> getCustomerTransactions(){
		return ResponseEntity.ok(service.getCustomerTransactions());
	}
	
	@PostMapping("/addTransaction")
	public ResponseEntity<String> addTransaction(@RequestBody CustomerTransaction transaction) {
		return ResponseEntity.ok(service.addTransaction(transaction));
	}
}
