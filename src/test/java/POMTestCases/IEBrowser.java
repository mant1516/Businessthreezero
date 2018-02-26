
package POMTestCases;

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

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;


public class IEBrowser {
	
	
	WebDriver driver;
	LoginPage objlogin;
	HomePage  objHomePage;
	InsightDetails objInsight;
	userGeneratedContent objUGC;
	

	@BeforeSuite(alwaysRun = true)
	 
	  public void setup() throws MalformedURLException {
		
		 
//		URL url = new URL( "http", "10.1.11.213", 4444, "/wd/hub" );
//		DesiredCapabilities capabilities =DesiredCapabilities.internetExplorer();
//		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
//		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//		System.out.println("1");
//		capabilities.setJavascriptEnabled(true);
//		System.out.println("2");
		
		System.setProperty("webdriver.ie.driver", "C:\\Jenkins\\workspace\\AutomationTest\\lib\\IEDriverServer.exe");
		
		
//		DesiredCapabilities capabilities =DesiredCapabilities.internetExplorer();
//		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
//		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

//		      WebDriver driver = new InternetExplorerDriver();
		      
		      
		      DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		      
				 // Settings to Accept the SSL Certificate in the Capability object
				 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 
				 InternetExplorerDriver driver = new InternetExplorerDriver(capabilities); 
				 
		      
		      
		      driver.get("https://conker.uat.businessthreezero.net:5005/login");
		       objlogin = new LoginPage(driver);   
			   objHomePage = new HomePage(driver);
		       objInsight = new InsightDetails(driver);
		       objUGC = new userGeneratedContent(driver);
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
		        /**
		         * Sets the amount of time to wait for a page load to complete before throwing an error. If the timeout is negative, page loads can be indefinite.
		         */
		        
		        //driver.manage().timeouts().pageLoadTimeout(100, SECONDS);

//		        driver.navigate().to("https://conker.uat.businessthreezero.net:5005/login");
		        
                 driver.manage().window().maximize(); 
                 
                 
                                
		    }
	  
  @Test ( priority= -3)
  
  public void login() throws InterruptedException {
	   
	    objlogin.loginToBusinessThreezero("mahantesh.shinagi@businessthreezero.com", "123456");
	    
	   Thread.sleep(30000);
	    
	}
  
  @Test( priority= -2)
  public void ugc() throws  InterruptedException{
	  objUGC.PostTheNewInsight("Testing the UGC");
	  Thread.sleep(30000);
	  	 
  }
  
  @Test(priority= -1 )
  public void ugcwithmedia() throws AWTException, InterruptedException{
	 
	  objUGC.PostTheNewInsightWithMedia("Testing with media");
	  Thread.sleep(3000);
	  	 
  }
  
  @Test(priority= 0)
  public void ugcwithpdf() throws AWTException, InterruptedException{
	 
	  objUGC.PostTheNewInsightWithPdf("Testing with pdf");
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
  
  @Test (priority = 10)
  
  public void navigate() throws InterruptedException{
	   
	   objHomePage.BluePrintIcon();
	   Thread.sleep(3000);
	   objHomePage.NavigatetoLeanandStrong();  
	   Thread.sleep(3000);
	   
	   objUGC.scroll();
	   objHomePage.BluePrintIcon();
	   
	   
	   objHomePage.NavigatetoLV30();
	    Thread.sleep(3000);  
	    objUGC.scroll();
	    objHomePage.BluePrintIcon();
		 
	    
	    objHomePage.NavigatetoGreenHeart();
	    Thread.sleep(3000);
	    objUGC.scroll();
	    objHomePage.BluePrintIcon();
	   
	    objHomePage.NavigatetoFightbetter();
	    Thread.sleep(3000);
	    objUGC.scroll();
	    objHomePage.BluePrintIcon();
	    
	    objHomePage.Navigatetodontwait();
	    Thread.sleep(3000);
	    objUGC.scroll();
	    objHomePage.BluePrintIcon();
	    
	    objHomePage.NavigatetoEverypound();
	    Thread.sleep(3000);
	    objUGC.scroll();
	    objHomePage.BluePrintIcon();
	   
	    
	    objHomePage.NavigatetoFeelspecial();
	    Thread.sleep(3000);
	    objUGC.scroll();
	    objHomePage.BluePrintIcon();
	    
  }
 
  @Test (priority =11)
  public void Title() throws InterruptedException{
	  
	  objHomePage.BluePrintIcon();
	  objHomePage.NavigatetoLeanandStrong();
	   Thread.sleep(30000);
	 
	  
  }
  
  
  
  @Test (priority =12)
  public void Comment() throws InterruptedException{
	  
	  objHomePage.NavigatetoLeanandStrong();
		
	  Thread.sleep(30000);
	  objInsight.MakeCommentWithIdeaForLeanAndStrong("Tetsing Data for Comments");
  }
  
  @Test (priority =13)
  public void Reply() throws InterruptedException{
	  
	  objHomePage.NavigatetoLeanandStrong();

	  objInsight.ReplyForTheComments("Reply Testing ");
  }
  
  @Test (priority =14)
  public void Share() throws InterruptedException{
	  
	  objInsight.SharetheInsight("@mshinagi1");
  }
  
  @Test (priority =15)
  public void CancelTheShare() throws InterruptedException{
	  
	  objInsight.CloseShareUiIcon();
  }
  
  @Test (priority =16)
  public void Saveinsight() throws InterruptedException{
	  
	  objInsight.SaveTheInsightFromFeed();
  }
  
 
 @Test (priority =18)
 public void likeInsight() throws InterruptedException{
	 
	 objInsight.LikeTheInsightFromFeed();
 }
  
@Test (priority =19)
public void unlikeInsight(){
	objInsight.UnliketheInsight();
}
  
  
  

@Test (priority = 20)
public void Bookmark() throws InterruptedException{
	objHomePage.BooKmarKTest();
	
 }

@Test (priority =21)
public void Activity() throws InterruptedException{
	objHomePage.ActivityTest();
}
  
@Test (priority =22)
public void Search() throws InterruptedException{
	objHomePage.SearchForTheInsight("customer");
}

@Test (priority =23)
public void Notifictaion() throws InterruptedException{
	objHomePage.NotificationTest();
	
}

@Test (priority =24)
public void Help() throws InterruptedException{
	objHomePage.OpenHelpContain();
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
	
  @AfterSuite
  public void afterMethod() {  
	  	  try {
	  		Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
	  		} catch (IOException e) {
	  		e.printStackTrace();
	  		}
  }

}
