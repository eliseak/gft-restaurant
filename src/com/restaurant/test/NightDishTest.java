package com.restaurant.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.restaurant.model.NightDish;

class NightDishTest {

	@Test
	void testValueOf() {
		
		assertEquals(NightDish.valueOf(1), NightDish.ENTREE);
		assertEquals(NightDish.valueOf(2), NightDish.SIDE);
		assertEquals(NightDish.valueOf(3), NightDish.DRINK);
		assertEquals(NightDish.valueOf(4), NightDish.DESSERT);
		
	}
	
	@Test
	void testSideDishCanRepeat() {
		
		NightDish dish = NightDish.SIDE;
		assertTrue(dish.CanBeRepeated());
		
	}
	
	@Test
	void testNonSideDishesCantRepeat() {
		
		NightDish dish = NightDish.ENTREE;
		assertFalse(dish.CanBeRepeated());
		
		dish = NightDish.DRINK;
		assertFalse(dish.CanBeRepeated());
		
		dish = NightDish.DESSERT;
		assertFalse(dish.CanBeRepeated());

	}
}
