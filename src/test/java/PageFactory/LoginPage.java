package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver ;

	@FindBy(id ="email")
	WebElement Email;
	
	@FindBy(id ="password")
	WebElement Password;
	
	@FindBy(xpath="html/body/my-app/auth-login/auth-wrapper/div/div/div/form/button")
	WebElement SignIn;
	
	@FindBy(className="greyLink forgotPassword")
	WebElement ForgotPassword;
	
	@FindBy(className="greyLink")
	WebElement CreateAccount;
	
	@FindBy(className="fuelLogo")
	WebElement Title;
	
	@FindBy(xpath="img..firepath-matching-node")
	 WebElement FuelIcon;
	
	@FindBy(css="h1.feed-title")
	WebElement FeedTitle;
	
	@FindBy(css="span.value-name.leanandstrong::before")
	WebElement FeedInsightTitle;
		
	@FindBy(linkText="Share")
	WebElement ShareIcon;
	
	@FindBy(xpath="html/body/my-app/insight-list/div/div/div/div/div[2]/user-generated-content/article/insight-footer/aside/div[2]/a[1]/svg")
    WebElement LikeUnLikeIcon;
	
	@FindBy(xpath="html/body/my-app/insight-list/div/div/div/div/div[2]/user-generated-content/article/insight-footer/aside/div[2]/a[2]/svg")
    WebElement SaveUnsaveIcon;
	
	@FindBy(xpath="html/body/my-app/share/div/div/form/input")
	WebElement ShareTextBox;
	
	@FindBy(xpath="html/body/my-app/share/div/div/form/button")
	WebElement SendtoacolleagueButton;
	
	@FindBy(xpath="html/body/my-app/share/div/div/a/svg/path")
	WebElement CloseShareUiIcon;
	
	@FindBy(xpath="html/body/my-app/root/div[1]/share/div/div/div[1]/div[3]/div/p")
	WebElement CopyToClipBoardLink;
	
	@FindBy(xpath="html/body/my-app/insight-list/div/div/div/div/div[2]/user-generated-content/article/div/div[2]/div/div[2]/p")
    WebElement OpenInsightDetailsIcon;
	
	@FindBy(xpath="html/body/my-app/root/div[2]/insight-detail/div[2]/div[1]/div[2]/div/react-tile/div/div/div/div[2]/div[1]/div")
	WebElement IhaveAnIdeaIcon;
	
	@FindBy(xpath="html/body/my-app/root/div[2]/insight-detail/div[2]/div[1]/div[2]/div/react-tile/div/div/div/div[2]/div[2]/div")
	WebElement IhaveAQuestionicon;
	
	@FindBy(xpath="html/body/my-app/root/div[2]/insight-detail/div[2]/div[1]/div[2]/div/react-tile/div/div/div/div[2]/div[3]/div")
    WebElement IhaveAComment;
	
	@FindBy(xpath="html/body/my-app/insight-detail/div/div/div/article/div/react-tile/div/div[1]/form/input")
	WebElement CommentTextBox;
	
	@FindBy(xpath="html/body/my-app/root/div[2]/insight-detail/div[2]/div[1]/div[2]/div/react-tile/div/div/div/div[3]/button[2]")
	WebElement PostCommentButton;
	
	@FindBy(xpath="html/body/my-app/root/div[2]/insight-detail/div[2]/div[1]/div[2]/div/react-tile/div/div/div/div[3]/button[1]")
	WebElement CancelCommentButton;
	
	@FindBy(xpath="html/body/my-app/insight-detail/div/div/div/article/div/comment-list/div/section[1]/footer/a")
	WebElement ReplyIcon;
	
	@FindBy(xpath="html/body/my-app/insight-detail/div/div/div/article/div/comment-list/div/section[1]/react-tile/div/div[1]/form/input")
	WebElement ReplyTextBox;
	
	@FindBy(xpath="html/body/my-app/root/div[2]/insight-detail/div[2]/div[1]/div[2]/div/comment-list/div/div/div[2]/div[2]/div[4]/react-tile/div/div/div/div[2]/button[2]")
	WebElement ReplyPostbutton;
	
	@FindBy(xpath="html/body/my-app/root/div[2]/insight-detail/div[2]/div[1]/div[2]/div/comment-list/div/div/div[2]/div[2]/div[4]/react-tile/div/div/div/div[2]/button[1]")
	WebElement ReplyCancelButton;
	
	
	@FindBy(xpath="html/body/my-app/root/div[2]/blueprint/main-navigation/div/div/div[2]/div")
	 WebElement SearchIcon;
	 
	 @FindBy(id="search")
	 WebElement SearchTextBox;
	 
	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[1]/notifications-dropdown/div/div/a/svg")
	 WebElement NotificationIcon;
	 
	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[1]/notifications-dropdown/div/div/div/notifications/div/div/div/div[1]/div[1]/b")
	 WebElement NotificationListItem;
	 
	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[1]/notifications-dropdown/div/div/div/notifications/div/div/div")
	 WebElement NotifictaionListFrame;
	 
	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[2]/profile-dropdown/div/div/a/div")
	 WebElement ProfileIcon;
	 
	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[2]/profile-dropdown/div/div/div/profile/nav/div/bookmark-list/profile-child/div[1]/span")
	 WebElement BookMark;

	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[2]/profile-dropdown/div/div/div/profile/nav/div/activity/div/profile-child/div[1]/span")
	 WebElement Activity;
	 
	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[2]/profile-dropdown/div/div/div/profile/nav/div/help/profile-child/div[1]/span")
	 WebElement Help;
	 
	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[2]/profile-dropdown/div/div/div/profile/nav/div/div")
	 WebElement Logout;

	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[2]/profile-dropdown/div/div/div/profile/nav/div/bookmark-list/profile-child/div[2]")
	 WebElement BookMarkList;
	 
	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[2]/profile-dropdown/div/div/div/profile/nav/div/bookmark-list/profile-child/div[2]/bookmark-item[1]/div/a[1]")
	 WebElement BookMarkListItem;
	 
	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[2]/profile-dropdown/div/div/div/profile/nav/div/activity/div/profile-child/div[2]")
	 WebElement ActivityList;
	 
	 @FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[2]/profile-dropdown/div/div/div/profile/nav/div/activity/div/profile-child/div[2]/div/div[1]/div[2]/b")
	 WebElement ActivityListItem;
	 
	 @FindBy(xpath="html/body/my-app/insight-detail/div/div/div/article/footer/a")
	 WebElement CloseTheInsight;


	public LoginPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }


    public void EnterEmailId(String strUserName){
    	
        Email.clear();
        Email.click();
        Email.sendKeys(strUserName);

    }
    
   
    public void EnterPassword(String password){
    	
         Password.clear();
         Password.click();
         Password.sendKeys(password);

    }

    //Click on login button

    public void clickLogin(){

            SignIn.click();

    }

    public void ClickFuelIcon(){
   	 FuelIcon.click(); 
    }

    //Get the title of Login Page

    public String getLoginTitle(){

     return    Title.getText();

    }
    
    
    public void clickForgotPassword() {
    
    	ForgotPassword.click();
    }
    
    
    public void CreateAccountLink() {
    	
    	CreateAccount.click();
    }
    
public void scrollUpAndDown() throws InterruptedException{
		
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		
	    jse3.executeScript("window.scrollBy(0,1950)", "");	 
	}
    

public void CompareTitle(){
	String Feedtitle = FeedTitle.getText();
	String FeedInsighttitle = FeedInsightTitle.getText();
	
	if(Feedtitle.equals(FeedInsighttitle)){
		System.out.println("Titles are same");
	}
		else{
			System.out.println("Something is wrong Check it");
		}
	
	} 
	

    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param string

     * @return

     */


	 public void loginToBusinessThreezero(String strUserName,String password){
         
		   this.EnterEmailId(strUserName);
		   this.EnterPassword(password); 
	       this.clickLogin();   

	    }
	 
	 public void Fuel(){
		 this.ClickFuelIcon();
	 }
	 
	 public void scroll() throws InterruptedException{
		 this.scrollUpAndDown();
	 }
	 
	 public void CompareTheTitle () throws InterruptedException{
		  driver.navigate().to("https://conker.dev.businessthreezero.net/insights/feed/leanandstrong");
		  Thread.sleep(30000);
		  this.CompareTitle();
	  }
	 
	 public void ClickShareIcon(){
			ShareIcon.click();
		}
		
		public void LiketheInsight(){
			LikeUnLikeIcon.click();
		}
		
		public void UnliketheInsight(){
			LikeUnLikeIcon.click();
		}
		
		public void SaveTheInsight(){
			SaveUnsaveIcon.click();
		}
		
		public void UnsaveTheInsight(){
			SaveUnsaveIcon.click();
		}
		
		public void ClearShareTextBox(){
		ShareTextBox.clear();
		}
		
		public void EnterUsernameInShareTextBox(String username){
			ShareTextBox.sendKeys(username);
		}
		
		public void SendtoacolleagueButton(){
			SendtoacolleagueButton.click();
		}
		
		public void CloseShareUiIcon(){
			CloseShareUiIcon.click();
		}
		
		public void CopyToClipBoardLink(){
			CopyToClipBoardLink.click();
		}
		
		public void OpenInsightDetailsIcon(){
			OpenInsightDetailsIcon.click();
		}
		
		public void IhaveAnIdeaIcon(){
			IhaveAnIdeaIcon.click();
		}
		
		public void IhaveAQuestionicon(){
			IhaveAQuestionicon.click();
		}
		
		public void IhaveAComment(){
			IhaveAComment.click();
		}
		
		public void ClearCommentTextBox(){
			CommentTextBox.clear();
		}
		
		public void EnterCommentTextBox(String comments){
			CommentTextBox.sendKeys(comments);	
		}
		
		public void PostCommentButton(){
			PostCommentButton.click();
		}
		
		public void CancelCommentButton(){
			CancelCommentButton.click();
		}
		
		public void ReplyIcon(){
			ReplyIcon.click();
		}
		
		public void ClearReplyTextBox(){
			ReplyTextBox.clear();
		}
		
		public void EnterCommentsInReplyTextBox(String comments){
			ReplyTextBox.sendKeys(comments);
		}
		
		public void ReplyPostbutton(){
			ReplyPostbutton.click();
		}
		
		public void ReplyCancelButton(){
			ReplyCancelButton.click();
		}
		
		public void ScrollTillCommentIcon(){
			
			JavascriptExecutor js14 = (JavascriptExecutor) driver;
	 
			js14.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("insight-detail-comment")), 1900);
		}
		
		public void ScrollTillReplyIcon(){
			JavascriptExecutor js15 = (JavascriptExecutor) driver;
			
		 js15.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("insight-detail-content-container")), 700);
		 
		}
		
		public void ScrollTillSaveIcon(){
			
			JavascriptExecutor js16 = (JavascriptExecutor) driver;

			 // Scroll inside web element vertically (e.g. 100 pixel)
			 js16.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("feed")), 100);
			 
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

			
			 js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("notifications-view")), 900);
			 
			 js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("notifications-view")), -900);
			 
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
		 
		 
		 
				
			public void scrollUpAndDown1() throws InterruptedException{
				
				JavascriptExecutor jse3 = (JavascriptExecutor) driver;
			    jse3.executeScript("window.scrollBy(0, 1050)", "");	 
			}
			
			public void WaitTill(){
				WebDriverWait wait = new WebDriverWait(driver,30);
			    
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/my-app/root/div[3]/insight-list/div/div/feed-detail/div")));
			}
			
			
			public void BooKmarKTest(){
				this.ClickProfileIcon();
				this.ClickBookMark();
				this.ScrollInBookMarkList();
				this.ClickBookMarkListItem();
				this.ClickCloseTheInsight();
				this.ClickFuelIcon();
			}
			
			public void ActivityTest() throws InterruptedException{
				this.ClickProfileIcon();
				this.ClickActivity();
				this.ScrollInActivity();
				this.ClickActivityListItem();
				this.ClickFuelIcon();
			}
			
			public void SearchForTheInsight(String searchInsight ){
				this.ClickSearchIcon();
				this.ClickSearchTextBox();
				this.EnterTextInSearchTextBox(searchInsight);
				this.ScrollInSearchList();
				this.ClickFuelIcon();
			}
			
			public void NotificationTest(){
				this.ClickNotificationIcon();
				this.ScrollNotifictaionListFrame();
				this.ClickNotificationListItem();
				this.ClickFuelIcon();
			}
			
			public void OpenHelpContain() throws InterruptedException{
				this.ClickProfileIcon();
				this.ClickHelp();
				this.ScrollInHelp();
				this.ClickProfileIcon();
				this.ClickFuelIcon();
			}
			
			public void LogoutFromApp() throws InterruptedException{
				this.ClickProfileIcon();
				this.ClickLogout();
			}
			
		
		
	 
	  
	  public void MakeCommentWithIdeaForLeanAndStrong(String comments) throws InterruptedException{
		  driver.navigate().to("https://conker.dev.businessthreezero.net/insights/feed/leanandstrong");
		  Thread.sleep(20000);
		  this.OpenInsightDetailsIcon();
		  this.scroll();
		  Thread.sleep(15000);
		  this.IhaveAComment();
		  this.ClearCommentTextBox();
		  this.EnterCommentTextBox(comments);
		  this.PostCommentButton();
		  this.IhaveAQuestionicon();
		  this.ClearCommentTextBox();
		  this.EnterCommentTextBox(comments);
		  this.PostCommentButton();
		  this.IhaveAComment();
		  this.IhaveAQuestionicon();
		  this.ClearCommentTextBox();
		  this.EnterCommentTextBox(comments);
		  this.PostCommentButton();	 
	  
	  }
	  
	  public void CompareTheTitle1 (){
		  driver.navigate().to("https://conker.dev.businessthreezero.net/insights/feed/leanandstrong");
		  this.CompareTitle();
	  }
	  
	  public void SharetheInsight(String username){
		  driver.navigate().to("https://conker.dev.businessthreezero.net/insights/feed/leanandstrong");
		  this.ClickShareIcon();
		  this.ClearShareTextBox();
		  this.EnterUsernameInShareTextBox(username);
		  this.SendtoacolleagueButton();
		  	  
	  }
	  
	  public void CloseTheShareUi(){
		  driver.navigate().to("https://conker.dev.businessthreezero.net/insights/feed/leanandstrong");
		  this.ClickShareIcon();
		  this.ClearShareTextBox();
		  this.CloseShareUiIcon();	  
	  }
	  
	  public void SaveTheInsightFromFeed(){
		  driver.navigate().to("https://conker.dev.businessthreezero.net/insights/feed/leanandstrong");
		  this.ScrollTillSaveIcon();
		  this.SaveTheInsight();
		  
	  }
	  
	  public void UnsaveTheInsightFromFeed(){
		  driver.navigate().to("https://conker.dev.businessthreezero.net/insights/feed/leanandstrong");
		  this.ScrollTillSaveIcon();
		  this.UnsaveTheInsight();
	  }
	  
	  public void LikeTheInsightFromFeed(){
		  driver.navigate().to("https://conker.dev.businessthreezero.net/insights/feed/leanandstrong");
		  this.LiketheInsight();
		 
	  }
	  
	  public void UnlikeTheInsightFromFeed(){
		  driver.navigate().to("https://conker.dev.businessthreezero.net/insights/feed/leanandstrong");
		  this.UnliketheInsight();
	  }
	  
	  public void ReplyForTheComments(String comments){
		  driver.navigate().to("https://conker.dev.businessthreezero.net/insights/feed/leanandstrong");
		  this.OpenInsightDetailsIcon();
		  this.ScrollTillReplyIcon();
		  this.ReplyIcon();
		  this.ClearReplyTextBox();
		  this.EnterCommentsInReplyTextBox(comments);
		  this.ReplyPostbutton();
		  this.Fuel();
	  }

	public void loginToBusinessThreezero(String strUserName, int i) {
		// TODO Auto-generated method stub
		
	}
}
