package POMTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;
import PageFactory.HomePage;
import PageFactory.InsightDetails;
import PageFactory.LoginPage;
import PageFactory.userGeneratedContent;

public class ReplyTest {

	WebDriver driver;
	LoginPage objlogin;
	HomePage  objHomePage;
	InsightDetails objInsight;
	userGeneratedContent objUGC;
	
	

	@BeforeSuite(alwaysRun = true)
	 
	  public void setup() throws MalformedURLException {
		
		URL url = new URL( "http", "172.27.224.78", 4444, "/wd/hub" );
		DesiredCapabilities capabilities =DesiredCapabilities.chrome();
		System.out.println("1");
		capabilities.setJavascriptEnabled(true);
		System.out.println("2");
		WebDriver driver = new RemoteWebDriver(url,capabilities);
		System.out.println("4");
	 
	
	    System.setProperty("webdriver.chrome.driver", "/Users/jenkins/Downloads/chromedriver");
  

		   //  System.setProperty("webdriver.chrome.driver", "C:\\Jenkins\\workspace\\AutomationTest\\lib\\chromedriver.exe");
		 
               //driver = new ChromeDriver();
		       objlogin = new LoginPage(driver);   
			   objHomePage = new HomePage(driver);
		       objInsight = new InsightDetails(driver);
		       objUGC = new userGeneratedContent(driver);
		    
		        
		        /**
		         * Sets the amount of time to wait for a page load to complete before throwing an error. If the timeout is negative, page loads can be indefinite.
		         */      
		        //driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
		       
		       driver.get("https://conker.dev.businessthreezero.net:5005/login");
		       
		       driver.manage().window().maximize(); 
			    
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
               
                          
		    }
	  
	  @Test ( priority= -10)
	  
	  public void login() throws InterruptedException {
		   
		  objlogin.loginToBusinessThreezero("admin@lvtest.com", "password");
		    
		   Thread.sleep(30000);
		    
		}
	 

  @Test (priority =13)
  public void Reply() throws InterruptedException{
	    
	  objInsight.ReplyForTheComments("Reply Testing from automation ");
  }
  

@Test (priority =25)
public void logout() throws InterruptedException{
	objHomePage.LogoutFromApp();
}




@AfterMethod
public void tearDown(ITestResult testResult) throws IOException {
	if (testResult.getStatus() == ITestResult.FAILURE) {
		utilities.TakingScreenshot.takeScreenshot(driver, testResult.getName());
	}
}	
	
//@AfterSuite
//public void afterMethod()  {
//	  	  driver.quit();	
//
//}
}
