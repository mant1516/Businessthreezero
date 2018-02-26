package POMTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import PageFactory.HomePage;
import PageFactory.InsightDetails;
import PageFactory.LoginPage;
import PageFactory.userGeneratedContent;


import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;


public class UGC {
	
	
	WebDriver driver;
	LoginPage objlogin;
	HomePage  objHomePage;
	InsightDetails objInsight;
	userGeneratedContent objUGC;
	
	

	@BeforeSuite(alwaysRun = true)
	public void setup() throws  MalformedURLException {
		
		  
		  URL url = new URL( "http", "172.27.224.78", 4444, "/wd/hub" );
			DesiredCapabilities capabilities =DesiredCapabilities.chrome();
			System.out.println("1");
			capabilities.setJavascriptEnabled(true);
			System.out.println("2");
			WebDriver driver = new RemoteWebDriver(url,capabilities);
			System.out.println("4");
		 
		
		    System.setProperty("webdriver.chrome.driver", "/Users/jenkins/Downloads/chromedriver");
		    // System.setProperty("webdriver.chrome.driver", "C:\\Jenkins\\workspace\\AutomationTest\\lib\\chromedriver.exe");
		 
		       driver = new ChromeDriver();
		       objlogin = new LoginPage(driver);   
			   objHomePage = new HomePage(driver);
		       objInsight = new InsightDetails(driver);
		       objUGC = new userGeneratedContent(driver);
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
		        /**
		         * Sets the amount of time to wait for a page load to complete before throwing an error. If the timeout is negative, page loads can be indefinite.
		         */      
		        //driver.manage().timeouts().pageLoadTimeout(100, SECONDS);

		        driver.get("https://conker.dev.businessthreezero.net:5005/login");
		        
                 driver.manage().window().maximize(); 
                          
		    }
	  
	  @Test ( priority= -10)
	  
	  public void login() throws InterruptedException {
		   
		  objlogin.loginToBusinessThreezero("admin@lvtest.com", "password");
		    
		   Thread.sleep(30000);
		    
		}
	  
	  @Test( priority= -9)
	  public void ugc() throws  InterruptedException{
		  objUGC.PostTheNewInsight("Testing the UGC");
		  Thread.sleep(30000);
		  	 
	  }
	  
//	  @Test(priority= -8)
//	  public void ugcwithmedia() throws AWTException, InterruptedException{
//		 
//		  objUGC.PostTheNewInsightWithMedia("Testing with media");
//		  Thread.sleep(3000);
//		  	 
//	  }
//	  
//	  @Test(priority= -7)
//	  public void ugcwithpdf() throws AWTException, InterruptedException{
//		 
//		  objUGC.PostTheNewInsightWithPdf("Testing with pdf");
//		  Thread.sleep(3000);
//		  	 
//	  }
	  
	  @Test(priority= -6)
	  public void editugc() throws InterruptedException{
		  objUGC.EditTheUGCWithOnlyText("Edited UGC");
		  Thread.sleep(3000);
	  }
	  
//	  @Test(priority= -5)
//	  public void editugcwithImage() throws InterruptedException, AWTException{
//		  objUGC.EditTheUGCWithImage("Edit with image ");
//		  Thread.sleep(3000);
//	  }
//	  
//	  @Test(priority= -4)
//	  public void editUGCwithPDF() throws InterruptedException, AWTException{
//		 objUGC.EditTheUGCWithPDf("Edit with PDF again");
//		  Thread.sleep(3000);
//	  }
//	  
	  @Test(priority= -3)
	  public void canceledit() throws InterruptedException, AWTException{
		 objUGC.CancelEdit();
		 Thread.sleep(3000);
	  }
	  
	  @Test(priority= -2)
	  public void DeletingUGC() throws InterruptedException{
		  objUGC.deleteUGC();
		  Thread.sleep(3000);
		  
	  }
 
  @Test (priority =1)
  public void shareFromFeed() throws InterruptedException{
	  
	  Thread.sleep(3000);
	  objUGC.ShareUGC("@mshinagi1");
  }
  
  @Test(priority= 3)
  
  public void commentwithalias() throws InterruptedException{
	 objUGC.FeedCommentTextBoxWithAlias1("@mshinagi1 Tetsing the alias");
	 	  
  }
  
  @Test(priority = 4)
  
  public void commentwithtext() throws InterruptedException{
	  objUGC.FeedCommentTextBoxOnlyText1("Test Test Test");
  }
  
  
  @Test (priority = 5)
  public void LikeUGC() throws InterruptedException{
	  objUGC.LikeTheUGCInsight();
  }
  
  @Test (priority = 6)
  public void unLikeUGC() throws InterruptedException{
	  objUGC.LikeTheUGCInsight();
  }
  
  @Test (priority = 7)
  public void SaveUGC() throws InterruptedException{
	  objUGC.SaveTheUGCInsight();
  }
  
  @Test (priority = 8)
  public void UnSaveUGC() throws InterruptedException{
	  objUGC.SaveTheUGCInsight();
  }
  
  @Test (priority =8)
  public void UnsaveInsight() throws InterruptedException{
	 objUGC.UnSaveTheUGCInsight();
  }
  
  
  @Test (priority = 9)
  public void SearchUGcInsight() throws InterruptedException{
	  objUGC.SearchTheUGCInsight("LV 3.0");
	  Thread.sleep(30000);
	  objUGC.scroll(); 
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
