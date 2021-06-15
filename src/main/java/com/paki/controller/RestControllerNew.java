package com.paki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paki.model.TestClient;
import com.paki.service.ClientService;


@RestController
@RequestMapping("/clients")
public class RestControllerNew {
	
	@Autowired
	private ClientService service;
	
	
	@GetMapping("/tarAll")
	public List<TestClient> targetAllData(){
		return service.lookAllClients();
	}
	
	@PostMapping("/tarNew")
	public TestClient tarNewData(@RequestBody TestClient test){
		return (TestClient) service.makeNewClient(test);
		
	}
	
	@GetMapping("/tarAll/{id_a}")
	public TestClient tarOneData(@PathVariable("id_a") int id_a){
		return service.lookOneClient(id_a);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
