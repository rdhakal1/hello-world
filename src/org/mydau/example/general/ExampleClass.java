package org.mydau.example.general;
/*
 * This class is setup as an example class to print out Hello World.
 */
public class ExampleClass {

	private String name;

	public String getName() {
		return name;
	}
	//to be used as a rest service endpoint to test this example application out

	public void setName(String name) {
		this.name = name;
		System.out.println(this.name);
	}
	
	
	
	
}
