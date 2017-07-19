package io.zipcoder;


public abstract class Pet {
	private String name;
	
	public Pet(String name) {
		this.name = name;
	}
	
	public abstract String speak();
	
	
	public final String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
