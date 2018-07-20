package com.restaurant.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.restaurant.model.MorningDish;

class MorningDishTest {
	
	@Test
	void testValueOf() {
		assertEquals(MorningDish.valueOf(1), MorningDish.ENTREE);
		assertEquals(MorningDish.valueOf(2), MorningDish.SIDE);
		assertEquals(MorningDish.valueOf(3), MorningDish.DRINK);
		assertEquals(MorningDish.valueOf(4), null);
	}
	
	@Test
	void testDrinkCanRepeat() {
		MorningDish dish = MorningDish.DRINK;
		assertTrue(dish.CanBeRepeated());
	}
	
	@Test
	void testNonDrinkDishesCantRepeat() {
		MorningDish dish = MorningDish.ENTREE;
		assertFalse(dish.CanBeRepeated());
		
		dish = MorningDish.SIDE;
		assertFalse(dish.CanBeRepeated());

	}
	
	

}
