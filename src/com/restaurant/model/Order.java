package com.restaurant.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Order {
	private TimeOfDay time;
	private Map<Integer, Integer> dishes;
	
	public Order (TimeOfDay time, int[] dishes){
		this.time = time;
		this.dishes = sortDishes(dishes);
	}
	
	public TimeOfDay getTime() {
		return time;
	}
	public void setTime(TimeOfDay time) {
		this.time = time;
	}
	public  Map<Integer, Integer> getDishes() {
		return dishes;
	}
	public void setDishes(Map<Integer, Integer> dishes) {
		this.dishes = dishes;
	}
	
	@Override
	public String toString() {
		return "Order [time=" + time + ", dishes=" + dishes + "]";
	}

	public String printOrder() {
		if (this.time == TimeOfDay.MORNING)
			return printMorningOrder();
		return printNightOrder();
	}
	
	private String printMorningOrder() {
		MorningDish[] md = MorningDish.values();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 4; i++) {
			if (dishes.containsKey(md[i].getId())){
				int value = dishes.get(md[i].getId());
				
				if (value > 1 && md[i].CanBeRepeated()) {
					if (sb.length() > 0) {
						sb.append(", ");
					}
					sb.append(md[i].toString());
					sb.append("(x");
					sb.append(value);
					sb.append(")");
					
				}else if (value == 1 && md[i].getId() != 4){
					if (sb.length() > 0) {
						sb.append(", ");
					}
					sb.append(md[i].toString());
					
				} else {
					if (sb.length() > 0) {
						sb.append(", ");
					}
					sb.append("error");
					return sb.toString();
					
				}
			}
		}
		
		return sb.toString();
	}
	
	private String printNightOrder() {
		NightDish[] nd = NightDish.values();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 4; i++) {
			if (dishes.containsKey(nd[i].getId())){
				int value = dishes.get(nd[i].getId());
				
				if (value > 1 && nd[i].CanBeRepeated()) {
					if (sb.length() > 0) {
						sb.append(", ");
					}
					sb.append(nd[i].toString());
					sb.append("(x");
					sb.append(value);
					sb.append(")");
					
				}else if (value == 1){
					if (sb.length() > 0) {
						sb.append(", ");
					}
					sb.append(nd[i].toString());
					
				} else {
					if (sb.length() > 0) {
						sb.append(", ");
					}
					sb.append("error");
					return sb.toString();
					
				}
			}
		}
		
		return sb.toString();
	}
	
	
	
	public Map<Integer, Integer> sortDishes(int[] dishesToSort){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		Arrays.sort(dishesToSort);
		
		for (int i = 0; i < dishesToSort.length; i++) {
			if (!map.containsKey(dishesToSort[i])) {
				map.put(dishesToSort[i], 1);
			}else {
				map.put(dishesToSort[i], map.get(dishesToSort[i]) + 1);
			}
		}
		
		return map;
	}
	
	
}
