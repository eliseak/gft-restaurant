package com.restaurant.model;

public enum MorningDish implements Dish{
	
	ENTREE("eggs", 1),
	SIDE("toast", 2),
	DRINK("coffee", 3),
	DESSERT("none", 4);;
	
	private int id;
	private String name;
	
	MorningDish(String dishName, int dishId) {
		this.id = dishId;
		this.name = dishName;
	}
	
	public int getId() {
		return id;
	}

	public static MorningDish valueOf(int id) {
		for (MorningDish i : values()) {
			if (i.id == id) {
				return i;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean CanBeRepeated() {
		return this.id == DRINK.getId()? true:false;
	}

	@Override
	public boolean CanBeServed() {
		return this.id == DESSERT.getId()? true:false;
	}
}
