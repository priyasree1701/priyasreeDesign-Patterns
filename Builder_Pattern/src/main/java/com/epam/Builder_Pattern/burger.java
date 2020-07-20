package com.epam.Builder_Pattern;

public abstract class burger implements ItemType {

	   @Override
	   public Packing packing() {
	      return new Wrap();
	   }

	   @Override
	   public abstract float price();
	}