package myfacebook;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import myfacebook.util.main;
public class TestMain {
	
	
	main obj;
	@Test
	public void TestAdd_TwoNumbers()
	{
		obj = new main();
		for(int i=1;i<=100;i++)
		{
			for(int j=1;j<=100;j++)
			{
				assertTrue(i + j == obj.add(i, j));
			}
		}
	}
}
