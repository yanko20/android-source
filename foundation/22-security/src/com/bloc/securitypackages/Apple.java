package com.bloc.securitypackages;
import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.Color;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public abstract class Apple extends Fruit {

	public Apple(String name, int calories, Color color, double weight){
		super(name, calories, color, weight);
	}


	public abstract void bite();

}