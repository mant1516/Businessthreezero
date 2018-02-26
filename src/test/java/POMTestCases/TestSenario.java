package POMTestCases;


import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import PageFactory.HomePage1;




public class TestSenario {
	WebDriver driver;
    HomePage1 objHomePageTest;



	@BeforeSuite(alwaysRun = true)
	 
	public void setup() throws  MalformedURLException, InterruptedException {
			  
		
		
		     System.setProperty("webdriver.chrome.driver", "/Users/mahanteshshinagi/Documents/workspace/Business3.0/selenium-java-3/lib/chromedriver");
		   

		     
         	       driver = new ChromeDriver();
         	      objHomePageTest = new HomePage1(driver);

			 
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
		        /**
		         * Sets the amount of time to wait for a page load to complete before throwing an error. If the timeout is negative, page loads can be indefinite.
		         */      
		        


		        driver.get("https://www.zopa.com/");
		        
		        
                driver.manage().window().maximize(); 
		       
              

                 
                          
		    }
	  
	
	 @Test 
	  
	  public void Testing() throws InterruptedException {
		 
		 objHomePageTest.ZopaGetLoanTestCase();
	
		    	    
		}    
		 }
				
	
