package Entities;

import Abstract.Entity;

public class User implements Entity {
	private int id;
	private int customerId;
	private String email;
	private String password;

	public User(int id, int customerId, String email, String password) {
		this.id = id;
		this.customerId = customerId;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
