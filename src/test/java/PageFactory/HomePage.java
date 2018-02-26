package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver ;
	
	
		
 @FindBy(xpath=".//*[@id='page-logo']/img")
 WebElement FuelIcon;
 
 @FindBy(name="search")
 WebElement SearchIcon;
 
 @FindBy(name="search")
 WebElement SearchTextBox;
 
 @FindBy(css="a.dropdown-toggle.nav-link > span")
 WebElement NotificationIcon;
 
 @FindBy(css="b.notification-title")
 WebElement NotificationListItem;
 
 @FindBy(className="notifications-view")
 WebElement NotifictaionListFrame;
 
 @FindBy(css="profile-dropdown > div.nav.navbar-nav > div.dropdown.pull-right > a.dropdown-toggle.nav-link > span")
 WebElement ProfileIcon;
 
 @FindBy(css="div.profile-child-icon-bar")
 WebElement BookMark;

 @FindBy(css="profile-child[name=\"Activity\"] > div.profile-child-icon-bar > span.icon-label")
 WebElement Activity;
 
 @FindBy(css="profile-child[name=\"Help\"] > div.profile-child-icon-bar")
 WebElement Help;
 
 @FindBy(css="div.logout-class")
 WebElement Logout;

 @FindBy(id="child-Bookmarks")
 WebElement BookMarkList;
 
 @FindBy(css="p.bookmark-title")
 WebElement BookMarkListItem;
 
 @FindBy(id="child-Activity")
 WebElement ActivityList;
 
 @FindBy(css="div.activity-middle-container > p.notification-text")
 WebElement ActivityListItem;
 
 @FindBy(css="div.closeInsightBtn")
 WebElement CloseTheInsight;
 
 @FindBy(xpath="html/body/my-app/root/main-navigation/header/div/nav/a[2]")
 WebElement BluePrintText;
 
	
	
 
 

 
	public HomePage(WebDriver driver) {
		this.driver= driver;
		
		 PageFactory.initElements(driver, this);		 
	}
		
public void ClickFuelIcon(){
	 FuelIcon.click(); 
 }

public void ClickBluePrintText(){
	BluePrintText.click();
}
 
 public void ClickSearchIcon(){
	 SearchIcon.click();
 }
 
 public void ClickSearchTextBox(){
	 SearchTextBox.clear();
 }
 
 public void EnterTextInSearchTextBox(String searchInsight){
	 SearchTextBox.sendKeys(searchInsight);
 }
 
 public void ClickNotificationIcon(){
	 NotificationIcon.click();
 }
 
 public void ClickNotificationListItem(){
	 NotificationListItem.click();
 }
 
 
 public void ScrollNotifictaionListFrame(){
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;

	
	 js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("notification-text")), 900);
	 
	 js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("notification-text")), -900);
	 
 }
 
 public void ScrollInBookMarkList(){
	 
	 JavascriptExecutor js10 = (JavascriptExecutor) driver;

	
	 js10.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("profile-bar-container")), 900);
	 
	 js10.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("profile-bar-container")), -900);
 }
 
 public void ScrollInActivity() throws InterruptedException{
	 
	 JavascriptExecutor js11 = (JavascriptExecutor) driver;

	 js11.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("profile-bar-container")), 900);
	 Thread.sleep(3000);
	 
	 js11.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("profile-bar-container")), -900);
 }
 
 public void ClickProfileIcon(){
	 ProfileIcon.click();
 }
 
 public void ClickBookMark(){
	 BookMark.click();
 }
 
 public void ClickBookMarkListItem(){
	 BookMarkListItem.click();
 }
 
 public void ClickActivity(){
	 Activity.click();
 }
 
 public void ClickHelp() throws InterruptedException{
	 ScrollInActivity();
	 Help.click();
 }
 
 public void ClickLogout() throws InterruptedException{
	 ScrollInActivity();
	 Logout.click();
 }
 
 public void ClickActivityListItem(){
	 ActivityListItem.click();
 }
 
 public void ClickCloseTheInsight(){
	 CloseTheInsight.click();
 }
 
 public void ScrollInSearchList(){
	 
	 JavascriptExecutor jse7 = (JavascriptExecutor) driver;
	    jse7.executeScript("window.scrollBy(0,950)", "");
	    
	    jse7.executeScript("window.scrollBy(0,-950)", "");
 }
 
 public void ScrollInHelp() throws InterruptedException{
	 
	 scrollUpAndDown();
 }
 		
	public void scrollUpAndDown() throws InterruptedException{
		
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
	    jse3.executeScript("window.scrollBy(0,950)", "");	 
	} 
	
	public void WaitTill(){
		WebDriverWait wait = new WebDriverWait(driver,30);
	    
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/my-app/root/div[3]/insight-list/div/div/feed-detail/div")));
	}
	
	
	public void BooKmarKTest() throws InterruptedException{
		
		this.ClickProfileIcon();
		this.ClickBookMark();
		Thread.sleep(3000);
		this.ScrollInBookMarkList();
		Thread.sleep(3000);
		this.ClickBookMarkListItem();
		this.ClickBookMark();
		this.ClickProfileIcon();
		Thread.sleep(3000);
		this.ClickCloseTheInsight();
		this.ClickFuelIcon();
	}
	
	public void ActivityTest() throws InterruptedException{
		this.ClickProfileIcon();
		
		this.ClickActivity();
		Thread.sleep(3000);
//		this.ScrollInActivity();
		Thread.sleep(3000);
		this.ClickActivityListItem();
		this.ClickActivity();
		this.ClickProfileIcon();
		Thread.sleep(3000);
		this.ClickFuelIcon();
	}
	
	public void SearchForTheInsight(String searchInsight ) throws InterruptedException{
		
		this.ClickSearchIcon();
		Thread.sleep(3000);
		this.ClickSearchTextBox();
		Thread.sleep(3000);
		this.EnterTextInSearchTextBox(searchInsight);
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/my-app/root/main-navigation/header/div/search/form/button")).click();
		this.ScrollInSearchList();
		Thread.sleep(3000);
		this.ClickFuelIcon();
	}
	
	public void NotificationTest() throws InterruptedException{
		this.ClickNotificationIcon();
		Thread.sleep(3000);
		this.ScrollNotifictaionListFrame();
		Thread.sleep(3000);
		this.ClickNotificationListItem();
		this.ClickNotificationIcon();
		Thread.sleep(3000);
		this.ClickCloseTheInsight();
		this.ClickFuelIcon();
	}
	
	public void OpenHelpContain() throws InterruptedException{
		this.ClickProfileIcon();
		Thread.sleep(3000);
		this.ClickHelp();
		Thread.sleep(3000);
//		this.ScrollInHelp();
		Thread.sleep(3000);
		this.ClickProfileIcon();
		
	}
	
	public void LogoutFromApp() throws InterruptedException{
		this.ClickProfileIcon();
		this.ClickLogout();
	}
	
	public void FlueIcon() throws InterruptedException{

		Thread.sleep(30000);
		this.ClickFuelIcon();
	}
	
	public void BluePrintIcon () throws InterruptedException{
		 this.ClickBluePrintText();
		 Thread.sleep(3000);
	 }
	
    public void NavigatetoLeanandStrong() {
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	jse.executeScript("window.document.changeInsightFeed('/insights/feed/leanandstrong')");
	
    }
    
     public void NavigatetoLV30() {
    	
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	
    	jse.executeScript("window.document.changeInsightFeed('insights/feed/lv30')");
    	
        }
    
    public void NavigatetoGreenHeart() {
    	
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	
    	jse.executeScript("window.document.changeInsightFeed('/insights/feed/greenheart')");
    	
        }

    public void NavigatetoEverypound() {
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	jse.executeScript("window.document.changeInsightFeed('/insights/feed/everypound')");
	
    }

   public void NavigatetoFightbetter() {
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	jse.executeScript("window.document.changeInsightFeed('/insights/feed/fightbetter')");
	
    }
   public void Navigatetodontwait() {
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	jse.executeScript("window.document.changeInsightFeed('/insights/feed/dontwait')");
	
    }

   public void NavigatetoFeelspecial() {
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	jse.executeScript("window.document.changeInsightFeed('/insights/feed/feelspecial')");
	
    }
    
    


	 
}
