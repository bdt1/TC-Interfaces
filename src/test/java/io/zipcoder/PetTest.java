package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PetTest {
	private Pet pet = null;
	private String name = null;
	

	@Before
	public void setup() {
		this.name = "Pet";
		this.pet = new Dog(name);
	}

	@Test
	public void testSetName() {
		// :Given
		String expected = "Pet";
		// :When
		String actual = pet.getName();
		// :Then
		Assert.assertEquals(expected, actual);
	}
}
