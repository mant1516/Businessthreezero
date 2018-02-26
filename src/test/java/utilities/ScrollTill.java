package utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Test;

public class ScrollTill {
	
	
   WebDriver driver;

	public ScrollTill(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		
		 PageFactory.initElements(driver, this);	
	}
	public JavascriptExecutor js;

	boolean reachedbottom = Boolean.parseBoolean(js.executeScript("return $(document).height() == ($(window).height() + $(window).scrollTop());").toString());
	{

    while (!reachedbottom) {
        
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)", "");
        try {
           
			reachedbottom=Boolean.parseBoolean(js.executeScript("return $(document).height() == ($(window).height() + $(window).scrollTop());").toString());
            WebElement element = driver.findElement(By.xpath("html/body/my-app/root/div[2]/insight-detail/div[2]/div[1]/div[2]/div/react-tile/div/div/div/div[2]/div[1]"));
            Wait<WebDriver> wait_element = new WebDriverWait(driver, 5);
            wait_element.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            System.out.println("!!!!!!!!!!!!!!At Last Get Success!!!!!!!!!!!!!!!!");
            break;
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
}
}