package First.Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class paralleltest {
	 WebDriver driver;

	    @Parameters("browser")
	    @Test
	    public void testMethod(String browserName) throws InterruptedException {
	        // 1) Open required browser
	        if (browserName.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browserName.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        } else if (browserName.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	        } else {
	            throw new RuntimeException("Browser not supported: " + browserName);
	        }

	        // 2) Maximize and open URL
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");

	        // Just to see the browser
	        Thread.sleep(3000);
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


