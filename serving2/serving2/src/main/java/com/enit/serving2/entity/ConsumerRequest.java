package com.enit.serving2.entity;

import java.io.Serializable;
import java.util.List;

public class ConsumerRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private Double lar;
	private Double lon;
    private List<String> preferences;
	private List<String> imPreferences;


	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public List<String> getPreferences() {
		return preferences;
	}

	public ConsumerRequest() {
		super();
	}

	public Double getLar() {
		return lar;
	}

	public List<String> getImPreferences() {
		return imPreferences;
	}
//
//	public String getRequestID() {
//		return requestID;
//	}

	public Double getLon() {
		return lon;
	}

	public String getUsername() {
		return username;
	}

	public ConsumerRequest( String username, Double lar, Double lon,List<String> preferences) {
//        this.requestID=requestId;
		this.username = username;
		this.preferences=preferences;
		this.lar = lar;
		this.lon = lon;

	}

	public ConsumerRequest(String username, Double lar, Double lon) {
		this.username = username;
		this.lar = lar;
		this.lon = lon;
	}
}
