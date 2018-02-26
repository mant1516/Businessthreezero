package PageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ScrollTill;

public class InsightDetails {
	
	WebDriver driver;
	public JavascriptExecutor js;
	ScrollTill Sc;
	
	
	@FindBy(xpath="html/body/my-app/root/div[3]/insight-list/div/div/feed-detail/div/span")
	WebElement FeedTitle;
	
	@FindBy(xpath="html/body/my-app/root/div[3]/insight-list/div/div/masonry/masonry-brick[1]/div/insight-tile/div/div/div/div/div[1]/span[1]")
	WebElement FeedInsightTitle;
	
	@FindBy(css="span.icon.shareBtn")
	WebElement ShareIcon;
	
	@FindBy(css="span.icon.likeBtn")
    WebElement LikeUnLikeIcon;
	
	@FindBy(css="span.icon.bookmarkBtn")
    WebElement SaveUnsaveIcon;
	
	@FindBy(name="input")
	WebElement ShareTextBox;
	
	@FindBy(className="share-send-Btn") 
	WebElement SendtoacolleagueButton;
	
	@FindBy(css="div.cancel-share")
	WebElement CloseShareUiIcon;
		
	@FindBy(css="header > h1")
    WebElement OpenInsightDetailsIcon;
	
	@FindBy(name="input")
	WebElement IhaveAnIdeaIcon;
	
	@FindBy(name="input")
	WebElement IhaveAQuestionicon;
	
	@FindBy(name="input")
    WebElement IhaveACommentIcon;
	
	@FindBy(name="input")
	WebElement CommentTextBox;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement PostCommentButton;
	
	@FindBy(xpath="html/body/my-app/root/div[2]/insight-detail/div[2]/div[1]/div[2]/div/react-tile/div/div/div/div[3]/button[1]")
	WebElement CancelCommentButton;
	
	@FindBy(linkText="Reply")
	WebElement ReplyIcon;
	
	@FindBy(xpath="(//input[@name='input'])[2]")
	WebElement ReplyTextBox;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement ReplyPostbutton;
	
	@FindBy(xpath="html/body/my-app/root/div[2]/insight-detail/div[2]/div[1]/div[2]/div/comment-list/div/div/div[2]/div[2]/div[4]/react-tile/div/div/div/div[2]/button[1]")
	WebElement ReplyCancelButton;
	
	@FindBy(xpath=".//*[@id='page-logo']/img")
	WebElement FuelIcon;
	
	@FindBy(xpath="html/body/my-app/root/main-navigation/header/div/nav/a[2]/img")
	WebElement BlueprintIcon;
	
	
	public InsightDetails(WebDriver driver) {
		
		
		this.driver= driver;
		
		 PageFactory.initElements(driver, this);
		
	}


	public void ClickFuelicon(){
		FuelIcon.click();
	}
	
	public void ClickBlueprinticon(){
		BlueprintIcon.click();
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
	
	public void OpenInsightDetailsIcon() throws InterruptedException{
		OpenInsightDetailsIcon.click();
		Thread.sleep(20000);
	}
	
	public void IhaveAnIdeaIcon(){
		IhaveAnIdeaIcon.click();
	}
	
	public void IhaveAQuestionicon(){
		IhaveAQuestionicon.click();
	}
	
	public void IhaveAComment(){
		IhaveACommentIcon.click();
	}
	
	public void ClearCommentTextBox(){
		CommentTextBox.clear();
	}
	
	public void EnterCommentTextBox(String comments){
		CommentTextBox.sendKeys(comments);
	    CommentTextBox.sendKeys(Keys.RETURN);
	}
	
	public void PostCommentButton(){
	
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
		ReplyTextBox.sendKeys(Keys.RETURN);
	}
	
	public void ReplyPostbutton(){
		ReplyPostbutton.click();
	}
	
	public void ReplyCancelButton(){
		ReplyCancelButton.click();
	}
	
	public void ScrollTillCommentIcon() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for (int second = 0;; second++) {
		    if(second >=2 ){
		        break;
		    }
		    jse.executeScript("window.scrollBy(0,250)", ""); 
		    Thread.sleep(3000);
		    
		}
	}
	
	public void ScrollTillReplyIcon() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for (int second = 0;; second++) {
		    if(second >=4 ){
		        break;
		    }
		    jse.executeScript("window.scrollBy(0,400)", ""); 
		    Thread.sleep(3000);
		    
		}	
	}
	
	public void ScrollTillSaveIcon() throws InterruptedException{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for (int second = 0;; second++) {
		    if(second >=2 ){
		        break;
		    }
		    jse.executeScript("window.scrollBy(0,100)", ""); 
		    Thread.sleep(3000);
		    
		}
		 
	}
	
	
  
  
  public void MakeCommentWithIdeaForLeanAndStrong(String comments) throws InterruptedException{
	  
	  this.OpenInsightDetailsIcon();
	  Thread.sleep(3000);
	  
	  /**
	   * Design changes so modifying the code
	   */
	  
	  this.ScrollTillCommentIcon();
	  Thread.sleep(3000);
      this.IhaveAQuestionicon();
	  this.ClearCommentTextBox();
	  this.EnterCommentTextBox(comments);
	  Thread.sleep(3000);
	  //this.PostCommentButton();
	  this.IhaveAQuestionicon();
	  this.ClearCommentTextBox();
	  this.EnterCommentTextBox(comments);
	  Thread.sleep(3000);
	  //this.PostCommentButton();
	  this.IhaveAQuestionicon();
	  this.ClearCommentTextBox();
	  this.EnterCommentTextBox(comments);
	  Thread.sleep(3000);
	  //this.PostCommentButton();	
  }
  
  public void CompareTheTitle (){
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.document.changeInsightFeed('/insights/feed/leanandstrong')");
	  this.CompareTitle();
  }
  
  public void SharetheInsight(String username) throws InterruptedException{
	  
	  this.ClickBlueprinticon();
	 Thread.sleep(2000);
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
		
	 jse.executeScript("window.document.changeInsightFeed('/insights/feed/leanandstrong')");
	  this.ScrollTillSaveIcon();
	  Thread.sleep(3000);
	  ShareIcon.click();
	  this.ClearShareTextBox();
	  this.EnterUsernameInShareTextBox(username);
	  SendtoacolleagueButton.click();	  	  
  }
  
  public void CloseTheShareUi() throws InterruptedException{
	  this.ClickBlueprinticon();
		 Thread.sleep(2000);
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
		
	jse.executeScript("window.document.changeInsightFeed('/insights/feed/leanandstrong')");
	
	  this.ScrollTillSaveIcon();
	  this.ClickShareIcon();
	  Thread.sleep(3000);
	  this.ClearShareTextBox();
	  Thread.sleep(3000);
	  this.CloseShareUiIcon();	 
	  Thread.sleep(3000);
	  
  }
  
  public void SaveTheInsightFromFeed() throws InterruptedException{
	  this.ClickBlueprinticon();
		 Thread.sleep(2000);
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.document.changeInsightFeed('/insights/feed/leanandstrong')");
	  this.ScrollTillSaveIcon();
	  Thread.sleep(3000);
	  this.SaveTheInsight();
	  Thread.sleep(3000);
	  
  }
  
  public void UnsaveTheInsightFromFeed() throws InterruptedException{
	  this.ClickBlueprinticon();
		 Thread.sleep(2000);
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.document.changeInsightFeed('/insights/feed/leanandstrong')");
	  this.ScrollTillSaveIcon();
	  Thread.sleep(3000);
	  this.UnsaveTheInsight();
	  Thread.sleep(3000);
  }
  
  public void LikeTheInsightFromFeed() throws InterruptedException{
	  this.ClickBlueprinticon();
		 Thread.sleep(2000);
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.document.changeInsightFeed('/insights/feed/leanandstrong')");
	  Thread.sleep(3000);
	  this.ScrollTillSaveIcon();
	  Thread.sleep(3000);
	  this.LiketheInsight();
	  Thread.sleep(3000);
	 
  }
  
  public void UnlikeTheInsightFromFeed(){
	 
	  this.UnliketheInsight();
  }
  
  public void ReplyForTheComments(String comments) throws InterruptedException{
	  this.ClickBlueprinticon();
		 Thread.sleep(2000);
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
			
	jse.executeScript("window.document.changeInsightFeed('/insights/feed/leanandstrong')");
	  this.OpenInsightDetailsIcon();
	  this.ScrollTillReplyIcon();
	  Thread.sleep(30000);
	  this.ReplyIcon();
	  this.ClearReplyTextBox();
	  this.EnterCommentsInReplyTextBox(comments);
	  Thread.sleep(3000);
	  
	  
  }
  
}
