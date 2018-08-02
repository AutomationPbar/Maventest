package core;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mavenfirst {
	
	@Test
	public void sum(){
		
		System.out.println("addition");
		int a = 5;
		int b = 10;
		
		Assert.assertEquals(a+b,15);
	}
	
	@Test
	public void sub(){
		
		System.out.println("subtraction");
		System.out.println("inside subs");
		int a = 5;
		int b = 10;
		
		Assert.assertEquals(b-a,5);
	}
	
	@Test
	public void multi(){
		
		System.out.println("multi");
		int a = 5;
		int b = 10;
		
		Assert.assertEquals(a*b,50);
	}
	
	@Test
	public void div(){
		
		System.out.println("division");
		int a = 5;
		int b = 10;
		
		Assert.assertEquals(b/a,2);
	}

}
