package AssertClassPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertPractice {

	@Test
	public void sample1() {
		String str1= "Hello";
		Assert.assertEquals(str1, "Hi");
		System.out.println(str1);
		
		
		String str2= "Hi";
		Assert.assertEquals(str2, "Hi");
		System.out.println(str2);
 }
	
	@Test
	public void sample2() {
		System.out.println("Automation");
	}
}
