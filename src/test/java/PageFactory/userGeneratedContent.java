package PageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class userGeneratedContent {
	
	WebDriver driver;
	
	@FindBy(xpath="html/body/my-app/header-navigation/header/div/a/img")
	WebElement FuelIcon;
	
	@FindBy(name="search")
	WebElement Searchbar;
	
	@FindBy(xpath="html/body/my-app/root/main-navigation/header/div/search/form/button")
	WebElement SearchBarSubmit;
	
	@FindBy(css="img")
	WebElement HomeIcon;
	
	@FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/a[2]/svg")
	WebElement BlueprintIcon;
	
	@FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[1]/notifications-dropdown/div/div/a/svg")
	WebElement NotificationIcon;
	
	@FindBy(xpath="html/body/my-app/header-navigation/header/div/primary-navigation/nav/div[2]/profile-dropdown/div/div/a/div/img")
	WebElement ProfileIcon;
	
	@FindBy(xpath="html/body/my-app/insight-list/div/div/div/div/insight-create-wrapper/section/insight-create/div[1]/textarea")
	WebElement TextArea;
	
	@FindBy(xpath="html/body/my-app/insight-list/div/div/div/div/insight-create-wrapper/section/insight-create/div[1]/a/img")
	WebElement AttachMediaIcon;
	
	@FindBy(xpath="html/body/my-app/insight-list/div/div/div/div/insight-create-wrapper/section/insight-create/div[2]/button")
	WebElement PostUGCInsight;
	
	@FindBy(xpath="html/body/my-app/insight-detail/div/div/div/article/div/react-tile/div/div[1]/form/input")
    WebElement FeedCommentTextBox;
	
	@FindBy(xpath="html/body/my-app/insight-detail/div/div/div/article/div/react-tile/div/div[2]/alias-search/div/div/div/div/div/div/div[1]")
	WebElement SelectAlias;
	
	@FindBy(xpath="html/body/my-app/insight-list/div/div/div/div/div[2]/user-generated-content/article/insight-footer/aside/div[1]/a[1]/svg")
	WebElement ShareUGCICon;
	
	@FindBy(xpath="html/body/my-app/share/div/div/form/input")
	WebElement ShareText;
	
	@FindBy(xpath="html/body/my-app/share/div/div/form/div/alias-search/div/div/div/div/div/div/div[1]/p")
	WebElement SelectTheAliasInShare;
	
	@FindBy(xpath="html/body/my-app/share/div/div/form/button")
	WebElement SubmitShare;
/** 
 * 	Start from here
 */
	@FindBy(css="span.icon.likeBtn")
	WebElement LikeIcon;
	
	@FindBy(css="span.icon.bookmarkBtn")
	WebElement SaveButton;
	
	@FindBy(xpath="html/body/my-app/root/div[3]/insight-list/div/div/insight-tile[1]/article/div/div/div/div[2]/div/header/h1")
	WebElement SelectSerachedItem;
	
	@FindBy(linkText="Cancel")
	WebElement CancelEdit;
	
	@FindBy(linkText="Delete")
	WebElement DeleteUGC;
	
	@FindBy(linkText="Edit")
	WebElement EditUGC;
	
	@FindBy(css="insight-create.user-content-edit > div.btn-tray > button.btn.btn-submit")
	WebElement UpdateEdit;
	
	@FindBy(css="button.file-remove")
	WebElement RemoveImage;
	
	@FindBy(xpath="//div/div/insight-create/div/textarea")
	WebElement EditUGCTextBox;
	

	
	public void ClickCancelEdit(){
	CancelEdit.click();
	}
	
	public void ClickDeleteUGC(){
		DeleteUGC.click();
	}
	
	public void ClickEditUGC(){
		EditUGC.click();
	}
	
	public void ClickUpdateEdit(){
		UpdateEdit.click();
	}
	
	public void ClickRemoveImage(){
		RemoveImage.click();
	}
	

	public void FeedCommentTextBoxWithAlias(String Alias) throws InterruptedException{
		FeedCommentTextBox.click();
		FeedCommentTextBox.clear();
		FeedCommentTextBox.sendKeys(Alias);
		
//		SelectAlias.click();
		FeedCommentTextBox.sendKeys(Keys.RETURN);
	}
	
	public void FeedCommentTextBoxOnlyText(String Comment){
		FeedCommentTextBox.click();
		FeedCommentTextBox.clear();
		FeedCommentTextBox.sendKeys(Comment);
		FeedCommentTextBox.sendKeys(Keys.RETURN);
	}
	
	public void ShareUGC(String aliasname) throws InterruptedException{
		ShareUGCICon.click();
		ShareText.click();
		ShareText.sendKeys(aliasname);
		Thread.sleep(3000);
		SelectTheAliasInShare.click();
		SubmitShare.click();
		Thread.sleep(30000);
	}
	

	public void FuelIconNew(){
		FuelIcon.click();
	}
	
	public void SelectSerachedItem(){
		SelectSerachedItem.click();
	}
	
	public void LikeIcon(){
		LikeIcon.click();
	}
	
	public void SaveButton(){
		SaveButton.click();
	}
	
	public void searchbar(String searchstring){
		Searchbar.clear();
		Searchbar.click();
		Searchbar.sendKeys(searchstring);
	}
	
	public void SearchBarSubmit(){
		SearchBarSubmit.click();
	}
	
   public void HomeIcon(){
	   HomeIcon.click();
   }
   
   public void BlueprintIcon(){
	   BlueprintIcon.click();
   }
   
   public void NotificationIcon(){
	   NotificationIcon.click();
   }
   
   public void ProfileIcon(){
	   ProfileIcon.click();
   }
   
   public void EnterText(String Postcomments){
	   TextArea.sendKeys(Postcomments);
   }
   
   public void EditText(String Postcomments){
	   EditUGCTextBox.sendKeys(Postcomments);
   }

   public void AttachMediaIcon(){
	   AttachMediaIcon.click();
   }
	
   public void PostUGCInsight(){
	   PostUGCInsight.click();
   }
   
   public void UploadImagefromSystem() throws AWTException, InterruptedException{
	   driver.findElement(By.cssSelector("a.btn-file-upload > img")).click();
	   WebElement El = driver.findElement(By.className("file-input"));
	   El.sendKeys("/Users/mahanteshshinagi/Downloads/Sample Documents for UGC/download.jpeg");
	   Thread.sleep(3000);
	 
   }
   
   public void UploadPDFfromSystem() throws AWTException, InterruptedException{
	   driver.findElement(By.cssSelector("a.btn-file-upload > img")).click();
	   WebElement El = driver.findElement(By.className("file-input"));
	   El.sendKeys("/Users/mahanteshshinagi/Downloads/Sample Documents for UGC/PDF.pdf");
	   Thread.sleep(3000);
	 
   }
   
 
   public void scroll() throws InterruptedException{
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   
		for (int second = 0;; second++) {
		    if(second >=5 ){
		        break;
		    }
		    jse.executeScript("window.scrollBy(0,950)", ""); 
		    Thread.sleep(3000);
		    		}
   }
   
   public void scrollTillshare() throws InterruptedException{
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	 
	   jse.executeScript("scroll(0, 150)");
		
	//  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("html/body/my-app/root/div[3]/insight-list/div/div/insight-tile[1]/div/div/div[3]/insight-footer/div/div[1]/a/span[2]")));

  }
	   
	    
   /**
    * 
    * @param driver
    */
   
   public userGeneratedContent(WebDriver driver) {
		
		
		this.driver= driver;
		
		 PageFactory.initElements(driver, this);
		
	}
   
   
  public void PostTheNewInsight(String Postcomments){
	  
	  this.EnterText(Postcomments);
	  this.PostUGCInsight();
	 	  
  }
  
  
public void PostTheNewInsightWithMedia(String Postcomments) throws AWTException, InterruptedException{  
	  this.EnterText(Postcomments);
	  this.UploadImagefromSystem();
	  this.PostUGCInsight();
	 	  
  }

public void PostTheNewInsightWithPdf(String Postcomments) throws AWTException, InterruptedException{  
	  this.EnterText(Postcomments);
	  this.UploadPDFfromSystem();
	  this.PostUGCInsight();
	 	  
}

public void Share(String aliasname) throws InterruptedException{
	this.scrollTillshare();
	this.ShareUGC(aliasname);
}

public void FeedCommentTextBoxWithAlias1(String aliasname) throws InterruptedException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.scrollTillshare();
	Thread.sleep(3000);
	this.FeedCommentTextBoxWithAlias(aliasname);
	Thread.sleep(3000);
}

public void FeedCommentTextBoxOnlyText1(String Comment) throws InterruptedException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.scrollTillshare();
	Thread.sleep(3000);
	this.FeedCommentTextBoxOnlyText(Comment);
	Thread.sleep(3000);
}

public void LikeTheUGCInsight() throws InterruptedException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.scrollTillshare();
	this.LikeIcon();
}

public void UnlikeUGCInsight() throws InterruptedException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.scrollTillshare();
	this.LikeIcon();
}

public void SaveTheUGCInsight() throws InterruptedException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.scrollTillshare();
	this.SaveButton();
}

public void UnSaveTheUGCInsight() throws InterruptedException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.scrollTillshare();
	this.SaveButton();
}

public void SearchTheUGCInsight(String searchstring) throws InterruptedException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.searchbar(searchstring);
	this.SearchBarSubmit();
}

public void MakeCommentAndReplyForTheAdminLoadedContent(){
    this.SelectSerachedItem();
       
}

public void EditTheUGCWithOnlyText(String Postcomments) throws InterruptedException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.ClickEditUGC();
	this.EditText(Postcomments);
	this.ClickUpdateEdit();
	Thread.sleep(3000);	
}

public void CancelEdit() throws InterruptedException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.ClickEditUGC();
	Thread.sleep(3000);
	this.ClickCancelEdit();
	Thread.sleep(3000);
}

public void EditTheUGCWithImage(String Postcomments) throws InterruptedException, AWTException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.ClickEditUGC();
	Thread.sleep(3000);
	this.EditText(Postcomments);
	Thread.sleep(3000);
	this.UploadImagefromSystem();
	Thread.sleep(3000);
	this.ClickUpdateEdit();
	Thread.sleep(30000);	
}


public void EditTheUGCWithPDf(String Postcomments) throws InterruptedException, AWTException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.ClickEditUGC();
	Thread.sleep(3000);
	this.EditText(Postcomments);
	Thread.sleep(3000);
	this.UploadPDFfromSystem();
	Thread.sleep(3000);
	this.ClickUpdateEdit();
	Thread.sleep(30000);
	
}

public void deleteUGC() throws InterruptedException{
	this.HomeIcon();
	Thread.sleep(3000);
	this.ClickDeleteUGC();
	Thread.sleep(3000);	
}

}

