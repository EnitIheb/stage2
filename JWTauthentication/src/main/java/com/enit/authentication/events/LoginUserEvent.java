package com.enit.authentication.events;

public class LoginUserEvent extends Event {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LoginUserEvent(String username) {
		super("login");
		this.username = username;

	}

	public LoginUserEvent() {

	}
}
