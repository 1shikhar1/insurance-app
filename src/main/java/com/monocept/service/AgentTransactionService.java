package com.monocept.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.AgentTransaction;
import com.monocept.model.dto.AgentTransactionDto;
import com.monocept.repository.AgentTransactionRepository;


@Service
public class AgentTransactionService {
	@Autowired
	private AgentTransactionRepository repo;
	
	public String addTransaction(AgentTransaction transaction) {
		return repo.addTransaction(transaction);
	}
	
	public List<AgentTransactionDto> getAgentTransactions(){
		return repo.getAgentTransactions().stream().map(t-> new AgentTransactionDto(t.getId(), t.getAgent().getName(), t.getTime(), t.getDescription(), t.getAmount(), t.getType())).collect(Collectors.toList());
	}
}
