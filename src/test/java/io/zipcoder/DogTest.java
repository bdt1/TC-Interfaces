package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {
	private Dog dog = null;
	private String name = null;
	

		@Before
		public void setup() {
			this.name = "Ol Boy";
			this.dog = new Dog(name);
		}
		
		
	@Test
	public void testSetNameDog() {
		// :Given
		String expected = "Ol Boy";
		// :When
		String actual = dog.getName();
		// :Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSpeakDog() {
		// :Given
		String expected = "woof";
		// :When
		String actual = dog.speak();
		// :Then
		Assert.assertEquals(expected, actual);
	}
}
