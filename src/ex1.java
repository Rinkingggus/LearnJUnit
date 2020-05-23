import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ex1 {
	public static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/Rinking/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//Open needed web-application
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();
		// Driver finds and clicks on AllProducts Tab.
		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		Thread.sleep(2000);

		
	}

	@Test
	void testNoNullTitle1() {
	System.out.println("Starting Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	Assert.assertNotNull(driver.getTitle());
	System.out.println("Ending Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	
	}
	
	//assert= compare
	
	@Test
	void testTitle() {
	System.out.println("Starting Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	
	Assert.assertEquals("Actual Titile Doesn't Match To Expected", driver.getTitle(),"ALL PRODUCTS | WWES-13 v.1.0");
	
	System.out.println("Ending Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	
	}
	
	
	@Test
	void testNoNullTitle2() {
	System.out.println("Starting Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	Assert.assertNotNull(driver.getTitle());
	System.out.println("Ending Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	
	}
	
	
	@Test
	void testNoNullTitle3() {
	System.out.println("Starting Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	Assert.assertNotNull(driver.getTitle());
	System.out.println("Ending Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	
	}
	
	
	@Test
	void testNoNullTitle4() {
	System.out.println("Starting Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	Assert.assertNotNull(driver.getTitle());
	System.out.println("Ending Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	
	}
	
	
	@Test
	void testNoNullTitle5() {
	System.out.println("Starting Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	Assert.assertNotNull(driver.getTitle());
	System.out.println("Ending Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	
	}
	
	
	@Test
	void testNoNullTitle6() {
	System.out.println("Starting Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	Assert.assertNotNull(driver.getTitle());
	System.out.println("Ending Test: " + new Object(){}.getClass().getEnclosingMethod().getName());
	
	}
	
	
	
	
@AfterAll
static void closeWebDriver() {
	driver.quit();
}
}
