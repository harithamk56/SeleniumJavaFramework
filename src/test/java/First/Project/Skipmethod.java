package First.Project;
import org.testng.annotations.Test;
public class Skipmethod {
	@Test
	public void test1() {
	    System.out.println("Test 1 runs");
	}

	@Test(enabled = false)
	public void test2() {
	    System.out.println("Test 2 will not run");
	}
}
//Disable this test method. Do NOT execute it.
//@Test(enabled = false) is used to disable a test method so that TestNG does not execute it. The test will appear as skipped in the report.