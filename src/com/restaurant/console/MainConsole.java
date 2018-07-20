package com.restaurant.console;

import java.util.Scanner;

import com.restaurant.model.Order;
import com.restaurant.model.TimeOfDay;

public class MainConsole {
	
	public static void main(String[] args) {
		System.out.println("Input: ");
		
		Scanner scanner = new Scanner(System.in); 
		String input[] = scanner.nextLine().split(",");
		scanner.close();

		TimeOfDay time;
		if (input[0].toLowerCase() == "morning") time = TimeOfDay.MORNING;
		else time = TimeOfDay.NIGHT;
		
		int[] dishes = new int[input.length-1];
		for (int i = 1; i < input.length; i++) {
			dishes[i-1] = Integer.parseInt(input[i]);
		}
		
		Order order = new Order(time, dishes);
		
		String output = order.printOrder();
		
		System.out.println("Output: " + output);	
	}
}
