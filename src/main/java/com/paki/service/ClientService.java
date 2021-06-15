package com.paki.service;

import java.util.List;

import com.paki.model.TestClient;

public interface ClientService {
	
	public TestClient makeNewClient(TestClient client);
	public List<TestClient> lookAllClients();
	public TestClient lookOneClient(int id);

}
