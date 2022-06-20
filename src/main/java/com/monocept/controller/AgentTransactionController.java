package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.AgentTransaction;
import com.monocept.model.dto.AgentTransactionDto;
import com.monocept.service.AgentTransactionService;

@RestController
@RequestMapping("/api/v1/agentTransaction")
public class AgentTransactionController {
	@Autowired
	private AgentTransactionService service;
	
	@GetMapping
	public ResponseEntity<List<AgentTransactionDto>> getAgentTransactions(){
		return ResponseEntity.ok(service.getAgentTransactions());
	}
	
	@PostMapping("/addTransaction")
	public ResponseEntity<String> addTransaction(@RequestBody AgentTransaction transaction) {
		return ResponseEntity.ok(service.addTransaction(transaction));
	}

}
