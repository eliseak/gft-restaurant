package com.restaurant.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.restaurant.model.Order;
import com.restaurant.model.TimeOfDay;

class OrderTest {
	
	@Test
	void testSortDishes() {
		int dishes[] = {2, 3, 1, 4, 2};
		Order o = new Order(TimeOfDay.NIGHT, dishes);
		Map<Integer, Integer> map = o.getDishes();
		
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		map2.put(1, 1);
		map2.put(2, 2);
		map2.put(3, 1);
		map2.put(4, 1);
		
		assertEquals(map, map2);
		
	}
	
	@Test
	void testPrintNightOrder() {
		int dishes[] = {2, 3, 1, 4, 2, 2};
		Order o = new Order(TimeOfDay.NIGHT, dishes);
				
		assertEquals(o.printOrder(), "steak, potato(x3), wine, cake");
		
		int dishes2[] = {2, 3, 1, 4, 2, 2, 3};
		o = new Order(TimeOfDay.NIGHT, dishes2);
		
		assertEquals(o.printOrder(), "steak, potato(x3), error");
		
		int dishes3[] = {2, 4};
		o = new Order(TimeOfDay.NIGHT, dishes3);
		
		assertEquals(o.printOrder(), "potato, cake");
		
	}
	
	@Test
	void testPrintMorningOrder() {
		int dishes[] = {2, 3, 1, 4, 2, 2};
		Order o = new Order(TimeOfDay.MORNING, dishes);
				
		assertEquals(o.printOrder(), "eggs, error");
		
		int dishes2[] = {2, 3, 3};
		o = new Order(TimeOfDay.MORNING, dishes2);
		
		assertEquals(o.printOrder(), "toast, coffee(x2)");
		
		int dishes3[] = {4};
		o = new Order(TimeOfDay.MORNING, dishes3);
		
		assertEquals(o.printOrder(), "error");
		
	}

}
