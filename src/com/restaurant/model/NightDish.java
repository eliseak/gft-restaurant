package com.restaurant.model;

public enum NightDish implements Dish{
	ENTREE("steak", 1),
	SIDE("potato", 2),
	DRINK("wine", 3),
	DESSERT("cake", 4);
	
	private int id;
	private String name;
	
	NightDish(String dishName, int dishId) {
		this.id = dishId;
		this.name = dishName;
	}
	
	public int getId() {
		return id;
	}

	public static NightDish valueOf(int id) {
		for (NightDish i : values()) {
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
		return this.id == SIDE.getId()? true:false;
	}

}
