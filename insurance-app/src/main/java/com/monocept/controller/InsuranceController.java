package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.InsurancePlan;
import com.monocept.model.InsuranceType;
import com.monocept.service.InsuranceService;

@RestController
@RequestMapping("/api/v1/insurance")
public class InsuranceController {
	@Autowired
	private InsuranceService insuranceService;
	
	@PostMapping("/addInsuranceType")
	public ResponseEntity<Boolean> addInsuranceType(@RequestBody InsuranceType type) {
		insuranceService.addInsuranceType(type);
		return ResponseEntity.ok(true);
	}
	
	@GetMapping("/insuranceType")
	public ResponseEntity<List<InsuranceType>> getInsuranceTypes(){
		return ResponseEntity.ok(insuranceService.getInsuranceTypes());
	}
	
	@GetMapping("/insuranceType/{name}")
	public ResponseEntity<InsuranceType> getInsuranceTypeByName(@PathVariable("name") String name) {
		return ResponseEntity.ok(insuranceService.getInsuranceTypeByName(name));
	}
	
	@PostMapping("/insuranceType/{name}/activate")
	public ResponseEntity<String> activateInsuranceType(@PathVariable("name") String name) {
		return ResponseEntity.ok(insuranceService.activateInsuranceType(name));
	}
	
	@PostMapping("/insuranceType/{name}/deactivate")
	public ResponseEntity<String> deactivateInsuranceType(@PathVariable("name") String name) {
		return ResponseEntity.ok(insuranceService.deactivateInsuranceType(name));
	}
	
	@PostMapping("/addInsurancePlan")
	public ResponseEntity<Boolean> addInsurancePlan(InsurancePlan plan) {
		insuranceService.addInsurancePlan(plan);
		return ResponseEntity.ok(true);
	}
	
	@GetMapping("/insurancePlan")
	public ResponseEntity<List<InsurancePlan>> getInsurancePlans(){
		return ResponseEntity.ok(insuranceService.getInsurancePlans());
	}
	
	@GetMapping("/insurancePlan/{name}")
	public ResponseEntity<InsurancePlan> getInsurancePlanByName(@PathVariable("name") String name) {
		return ResponseEntity.ok(insuranceService.getInsurancePlanByName(name));
	}
	
	@PostMapping("/insurancePlan/{name}/activate")
	public ResponseEntity<String> activateInsurancePlan(@PathVariable("name") String name) {
		return ResponseEntity.ok(insuranceService.activateInsurancePlan(name));
	}
	
	@PostMapping("/insurancePlan/{name}/deactivate")
	public ResponseEntity<String> deactivateInsurancePlan(@PathVariable("name") String name) {
		return ResponseEntity.ok(insuranceService.deactivateInsurancePlan(name));
	}

}
