package AssertClassPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {

	@Test
	public void sample1() {
		SoftAssert soft = new SoftAssert();
		
		String str1= "Hello";
		Assert.assertEquals(str1, "Hi");
		System.out.println(str1);
		
		
		String str2= "Hi";
		Assert.assertEquals(str2, "Hi");
		System.out.println(str2);

		soft.assertAll();
	}
}
