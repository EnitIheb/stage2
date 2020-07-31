package com.enit.authentication.events;

import java.util.List;

public class UpdateUserPreferences extends Event {

	private String username;
	private List<String> preferenecs;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getPreferenecs() {
		return preferenecs;
	}

	public void setPreferenecs(List<String> preferenecs) {
		this.preferenecs = preferenecs;
	}

	public UpdateUserPreferences(String username, List<String> preferenecs) {
		super("user preferences updated");
		this.preferenecs = preferenecs;
		this.username = username;
	}

	public UpdateUserPreferences() {

	}
}
