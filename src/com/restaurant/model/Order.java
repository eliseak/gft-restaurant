package com.restaurant.model;

import java.util.Arrays;

public class Order {
	private TimeOfDay time;
	private int[] dishes;
	
	public TimeOfDay getTime() {
		return time;
	}
	public void setTime(TimeOfDay time) {
		this.time = time;
	}
	public int[] getDishes() {
		return dishes;
	}
	public void setDishes(int[] dishes) {
		this.dishes = dishes;
	}
	
	@Override
	public String toString() {
		return "Order [time=" + time + ", dishes=" + Arrays.toString(dishes) + "]";
	}
	
	public String printOrder() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.toString());
		
		return sb.toString();
	}
	
}
