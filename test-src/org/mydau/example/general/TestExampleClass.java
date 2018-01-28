package org.mydau.example.general;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestExampleClass {
	
	ExampleClass ex;

	@BeforeEach
	void setUp() throws Exception {
		ex=new ExampleClass();
		ex.setName("Rhiyesha Dhakal");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetName() {
		assertEquals("Rhiyesha Dhakal",ex.getName());
		
	}

	@Test
	void testSetName() {
		ex.setName("Romani Dhakal");
		assertNotEquals("Rhiyesha Dhakal",ex.getName());
		assertEquals("Romani Dhakal", ex.getName());
	}

}
