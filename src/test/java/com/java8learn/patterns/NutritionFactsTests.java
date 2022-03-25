package com.java8learn.patterns;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.java8learn.patterns.NutritionFacts.Builder;

class NutritionFactsTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertTrue(true);
	}
	
	@Test
	void test2() {
		assertTrue(false);
	}
	
	@Test
	void testNutritionFacts() {
		NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8).calories(100).carbohydrate(200).fat(10).sodium(5).build();
		assertEquals(nutritionFacts.getServingSize(), 240);
		assertEquals(nutritionFacts.getServings(), 8);
		assertEquals(nutritionFacts.getCalories(), 100);
		assertEquals(nutritionFacts.getCarbohydrate(), 200);
		assertEquals(nutritionFacts.getFat(), 10);
		assertEquals(nutritionFacts.getSodium(), 5);
	}

}
