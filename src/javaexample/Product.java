package javaexample;

public class Product implements IProduct {
	
	private String arg1;

	public Product(String arg1) {
		super();
		this.arg1 = arg1 + " - this is value of field of MainClass";
		System.out.println("This is constructor of Main Class: this.arg1 = " + this.arg1);
	}
	
	public void methodMainClass () {
		
		System.out.println("methodMainClass Method of Main Class");
		
	}
	
	public String getFieldMainClass  () {
		return this.arg1;
	}
	
	

}
