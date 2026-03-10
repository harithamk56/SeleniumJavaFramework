package First.Project;
import org.testng.annotations.Test;

public class Invocationcount {
	@Test(invocationCount = 3)
	public void testMethod() 
	{
	    System.out.println("Running test");
	}

	}


//How many times a single test method should run.