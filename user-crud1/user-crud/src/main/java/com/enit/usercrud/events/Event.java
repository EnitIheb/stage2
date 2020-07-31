package com.enit.usercrud.events;

public  abstract class Event {
    
	private String type;

	public Event(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Event() {
		
		
	}
	
	
}
