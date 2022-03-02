package com.example.demo.request;

import lombok.Data;

@Data
public class InfoRequest {
	String[] data;

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}
	
	
}
