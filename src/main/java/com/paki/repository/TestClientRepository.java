package com.paki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paki.model.TestClient;

public interface TestClientRepository extends JpaRepository<TestClient,Integer> {

}
