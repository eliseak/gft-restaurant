package com.restaurant.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.restaurant.model.MorningDish;

class MorningDishTest {
	
	@Test
	void testValueOf2IsToast() {

		assertEquals(MorningDish.valueOf(2), MorningDish.SIDE);
	}
	
	@Test
	void testValueOf4IsNull() {

		assertEquals(MorningDish.valueOf(4), null);
	}
	
	@Test
	void testMorningDrinkCanRepeat() {
		MorningDish dish = MorningDish.DRINK;
		assertTrue(dish.CanBeRepeated());
	}
	
	@Test
	void testMorningEntreeCantRepeat() {
		MorningDish dish = MorningDish.ENTREE;
		assertFalse(dish.CanBeRepeated());
	}
	
	

}
