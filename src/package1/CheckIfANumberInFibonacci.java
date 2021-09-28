package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckIfANumberInFibonacci {
	
	private boolean checkIfNumberInFibonacci(int n) {
		int x=0,y=1,sum=0;
		
		while(n>0)
		{
			sum = x+y;
			x=y;
			y=sum;
			if(sum>=n)
			{
				break;
			}
		}
		if(sum<1)
		{
			return false;
		}
		else if((sum==n)||(sum==1))
		{
			return true;
		}
		
		else
			return false;
	}
	
	
	@Test
	public void testCase4()
	
	{
		Assert.assertEquals(checkIfNumberInFibonacci(23), false);
		
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(checkIfNumberInFibonacci(1), true);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(checkIfNumberInFibonacci(55), true);
	}
	
	@Test
	public void testCase3()
	{
		Assert.assertEquals(checkIfNumberInFibonacci(0), false);
	}

}
