package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {
	private Cat cat = null;
	private String name = null;
	

		@Before
		public void setup() {
			this.name = "Kitty";
			this.cat = new Cat(name);
		}
		
		
	@Test
	public void testSetNameCat() {
		// :Given
		String expected = "Kitty";
		// :When
		String actual = cat.getName();
		// :Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSpeakCat() {
		// :Given
		String expected = "meow";
		// :When
		String actual = cat.speak();
		// :Then
		Assert.assertEquals(expected, actual);
	}
}

