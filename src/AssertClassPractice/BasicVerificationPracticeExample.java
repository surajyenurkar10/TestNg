package AssertClassPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicVerificationPracticeExample {

	
		//1. AssertEquals()=> if actual and expected are matching.
		
		@Test
		public void Test1() {
			String Actual ="Hi";
			String Expected ="Hello";
			Assert.assertEquals(Actual, Expected);
		}
		
		//2. AssertNotEquals()=> if actual and expected are not matching then TC will pass.
		
			@Test
			public void Test2() {
				String Actual ="Hi";
				String Expected ="Hello";
				Assert.assertEquals(Actual, Expected);
			}
			
			//3. AssertNull=> TC will pass if field is empty.
			
			@Test
			public void Test3() {
				String products =null;
			    Assert.assertNull(products);
			}
			
			@Test
			public void Test4() {
				String products ="1500";
			    Assert.assertNull(products);
			}
			
			@Test
			public void Test5() {
				String products ="1500";
			    Assert.fail();
			}
			
	}


