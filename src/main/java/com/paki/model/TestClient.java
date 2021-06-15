package com.paki.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEST_CLIENT")
public class TestClient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private double height;
	
	public TestClient() {
		super();
		
	}
	
	public TestClient(String firstName, String lastName, double height) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "TestClient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", height=" + height
				+ "]";
	}
	
	
	
	
	
}