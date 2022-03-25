package com.java8learn.utils;

public class Apple {
	private int weight = 0;
	private COLOR color;

	public Apple() {

	}

	public Apple(int weight, COLOR color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public COLOR getColor() {
		return color;
	}

	public void setColor(COLOR color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + "]";
	}

}
