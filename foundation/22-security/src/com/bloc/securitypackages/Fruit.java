package com.bloc.securitypackages;
import com.bloc.securitypackages.Color;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public abstract class Fruit extends Object {
	// The name of the fruit
	private String mName;
	// Number of calories
	private int mCalories;
	// Color of the fruit
	private Color mColor;
	// Weight of the fruit, in pounds
	private double mWeight;

	Fruit() {
		this("Apple");
		// Default fruit
	}

	Fruit(String name) {
		this(name, 0);
	}

	Fruit(String name, int calories) {
		this(name, calories, null);
	}

	Fruit(String name, int calories, Color color) {
		this(name, calories, color, 0d);
	}

	public Fruit(String name, int calories, Color color, double weight) {
		this.mName = name;
		this.mCalories = calories;
		this.mColor = color;
		this.mWeight = weight;
	}

	private String getName() {
		return mName;
	}

	private void setName(String name) {
		mName = name;
	}

	int getCalories() {
		return mCalories;
	}

	void setCalories(int calories) {
		mCalories = calories;
	}

	Color getColor() {
		return mColor;
	}

	private void setColor(Color color) {
		mColor = color;
	}

	public double getWeight() {
		return mWeight;
	}

	public void setWeight(double weight) {
		mWeight = weight;
	}
}