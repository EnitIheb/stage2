package com.enit.authentication.events;

public class LogoutUserEvent extends Event {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LogoutUserEvent(String username) {
		super("logout");
		this.username = username;

	}

	public LogoutUserEvent() {

	}
}
