package com.epam.Builder_Pattern;

public class burgerVeg extends burger{
	 @Override
	 public float price() {
	    return 33.75f;
	 }

	 @Override
	 public String name() {
	    return "Veg Burger";
	 }
}