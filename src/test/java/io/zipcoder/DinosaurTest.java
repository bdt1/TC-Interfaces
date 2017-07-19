package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DinosaurTest {
	
	private Dinosaur dinosaur = null;
	private String name = null;
	

		@Before
		public void setup() {
			this.name = "Rex";
			this.dinosaur = new Dinosaur(name);
		}
		
		
	@Test
	public void testSetNameDinosaur() {
		// :Given
		String expected = "Rex";
		// :When
		String actual = dinosaur.getName();
		// :Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSpeakDinosaur() {
		// :Given
		String expected = "roar";
		// :When
		String actual = dinosaur.speak();
		// :Then
		Assert.assertEquals(expected, actual);
	}
	
	
}


