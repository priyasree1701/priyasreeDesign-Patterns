package com.epam.Builder_Pattern;

public class Brunch1{
	public Brunch VegMeal(){
      Brunch m = new Brunch();
      m.addItem(new burgerVeg());
      m.addItem(new Cola());
      return m;
   }   
}