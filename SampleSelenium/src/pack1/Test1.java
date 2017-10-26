package pack1;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {
	@Test(dataProvider="data",groups="regression")
	void getdata(String s1,String s2,String s3)
	{
		//System.out.println(s1+"  "+ s2+"    "+s3);
	}
	@Test
	void skipTestcase(){
		//throw new SkipException("I want to skip this test case");
		System.out.println("checking skip exception throug xml file");
	}
	@Test(groups="regression")
	void testCase2()
	{
		System.out.println("test case 2");
	}
	@Test(groups="regression")
	void testCase3()
	{
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("Raj", "Shekar");
		//Assert.assertEquals("Raja", "sekar");
		System.out.println("test case 3");
	}
	@Test(groups="regression")
	void testCase4()
	{
		System.out.println("test case 4");
		System.out.println("testing");
	}
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj=new Object[2][3];

		obj[0][0]="user1";
		obj[0][1]="user1";
		obj[0][2]="user1";

		obj[1][0]="user2";
		obj[1][1]="user2";
		obj[1][2]="user2";
		return obj;
	}
}
