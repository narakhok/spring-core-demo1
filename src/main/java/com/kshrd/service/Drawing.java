package com.kshrd.service;

import com.kshrd.model.Traingle;

public class Drawing {
	Traingle traingle;

	public Drawing(){}
	public Drawing(Traingle traingle) {
		this.traingle = traingle;
	}

	public Traingle getTraingle() {
		return traingle;
	}

	public void setTraingle(Traingle traingle) {
		this.traingle = traingle;
	}

	public void Draw() {
		System.out.println("I am drawing" + traingle.getType());
	}
}
