package com.enit.authentication.events;

public class RegisterUserEvent extends Event {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public RegisterUserEvent(String username) {
		super("login");
		this.username = username;

	}

	public RegisterUserEvent() {

	}
}
