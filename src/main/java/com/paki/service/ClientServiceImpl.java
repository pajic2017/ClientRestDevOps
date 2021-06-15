package com.paki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paki.model.TestClient;
import com.paki.repository.TestClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private TestClientRepository repo;
	
	@Override
	public TestClient makeNewClient(TestClient client){
		return (TestClient)repo.save(client);
	}
	
	//all data
	@Override
	public List<TestClient> lookAllClients(){
		return (List<TestClient>) repo.findAll();
	}
	
	@Override
	public TestClient lookOneClient(int id){
		return repo.findById(id).get();
		
	}

}
