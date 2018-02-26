package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage1 {
	
	WebDriver driver ;
	
	 @FindBy(css=".button.button--fullWidth")
	 WebElement GetloanOption;
	 
	 @FindBy(id ="amount")
	 WebElement AmountField;
	 
	 @FindBy( id="term_4")
	 WebElement FiveYearsOption ;
	 
	 @FindBy (id ="submit-loan-button")
	WebElement GetQuoteOption ; 
	 
	 @FindBy(css="data-automation='ZA.choice_summary'")
	 WebElement SummaryLoan ;
	 
	 @FindBy(id="member_email")
	 WebElement EmailOption ;
	 
	 @FindBy(css="data-automation='ZA.title'")
	 WebElement TitleOption ;
	 
	 @FindBy(css="#applications_loan_apply_title_mr")
	 WebElement MrOption ;
	 
	 @FindBy(id="applications_loan_apply_first_name")
	 WebElement FirstName ;
	 
	 @FindBy(id="applications_loan_apply_last_name")
	 WebElement LastName ;
	 
	 @FindBy(id="applications_loan_apply_home_phone")
	 WebElement PhoneNumber ;
	 
	 @FindBy(css="data-automation='ZA.date_of_birth_day'")
	 WebElement DateOfBirth ;
	 
	 @FindBy(id="date_of_birth_day")
	 WebElement DateDOB;
	 
	 @FindBy(id="date_of_birth_month")
	 WebElement DateMonth;
	 
	 @FindBy(id="date_of_birth_year")
	 WebElement Dateyear;
	 
	 @FindBy(id="applications_loan_apply_loan_purpose_car")
	 WebElement car;
	 
	 @FindBy(id="applications_loan_apply_loan_purpose_home_improvements")
	 WebElement HomeImpro;
	 
	 @FindBy(id="applications_loan_apply_loan_purpose_consolidate")
	 WebElement DebtCon;
	 

	 
	 @FindBy(css="applications_loan_apply_loan_purpose_car'")
	 WebElement LoanPurpose ;
	 
	 @FindBy(id="address_postcode")
	 WebElement Postcode ;
	 
	 @FindBy(name="find_address")
	 WebElement FindAddress ;
	 
	 @FindBy(id="address_possible_address")
	 WebElement PossibleAddr ;
	 
	 @FindBy(id="address_from_2i")
	 WebElement AddressMonth;
	 
	 @FindBy(id="address_from_1i")
	 WebElement AddressYear;
	 
	 

	 @FindBy(name="applications_loan_apply[employment_status]")
	 WebElement EmploymentStatus ;
	 
	 @FindBy(id="applications_loan_apply_employment_status_employed_full_time")
	 WebElement EmploymentStatusFullTime ;
	 
	 @FindBy(id="applications_loan_apply_salary")
	 WebElement Salary ;
	 
	 @FindBy(className="applications_loan_apply_residential_status_owner_no_mortgage")
	 WebElement HomeStatus ;
	 
	 @FindBy(id="applications_loan_apply_residential_status_owner_no_mortgage")
	 WebElement Owner ;
	 
	 @FindBy(id="applications_loan_apply_rent")
	 WebElement Rent ;
	 
	 @FindBy(id="member_password")
	 WebElement Password ;
	 
	 @FindBy(id="password_validation_rules")
	 WebElement PasswordRules ;
	 
	 
	
	
 
	 public HomePage1(WebDriver driver) {
			this.driver= driver;
			
			 PageFactory.initElements(driver, this);		 
		}
	 
	 public void GetloanOption (){
		 GetloanOption.click(); 
	 }
	 
	 public void AmountField (){
		String amt = AmountField.getText();
		amt.equals("10000");
	 }
	 
	 public void GetQuote(){
		 GetQuoteOption.click();
	 }
	 
	 public void EmailFiled (){
		 EmailOption.sendKeys("mahantesh.shinagi@gmail.com");
		 
	 }
	 
	 public void MrOption() throws InterruptedException{
		
		 MrOption.click();
	 }
	 
	 public void FirstName(){
		 FirstName.sendKeys("Mahantesh");
		 
	 }
	 
	 public void Lastname(){
		 LastName.sendKeys("Shinagi");
		 
	 }
	 
	 public void PhoneNumber(){
		 PhoneNumber.sendKeys("07438948158");
	 }
	 
	 public void DateOfBirth() throws InterruptedException{
		 DateDOB.sendKeys("15");
		
		 DateMonth.sendKeys("10");
	
		 Dateyear.sendKeys("1990");
	
			 
	 }
	 
	
	 
	 
	 public void LoanReasons(){
		 
		 WebElement element = driver.findElement(By.cssSelector("#applications_loan_apply_loan_purpose_car"));

   	  Actions actions = new Actions(driver);

   	  actions.moveToElement(element).click().perform();
		 
	 }
	 
	 public void EnterAddress(){
		 
		 Postcode.sendKeys("e61jr");
	 }
	 
	 public void LookForAddress(){
		 FindAddress.click();
	 }
	 
	 public void selectAddress(){
		 WebElement address = driver.findElement(By.id("address_possible_address"));
		 address.findElements(By.tagName("option")).get(0).click();
	 
	 }
	 
	 public void LivingFrom(){
		 
		 AddressMonth.click();
		 
		 Select addrMonth = new Select(driver.findElement(By.id("address_from_2i")));
		 
		 addrMonth.selectByVisibleText("January");
		 addrMonth.selectByIndex(1);
		 
		 
		
		 
		 AddressYear.click();
		 
		 Select addrYear = new Select(driver.findElement(By.id("address_from_1i")));
		 addrYear.selectByVisibleText("2014");
		 addrYear.selectByIndex(5);
		 
		 driver.findElement(By.cssSelector("input.primary[value='Use this address']")).click();
		
		 
	 }

	public void EmploymentStatusFullTime(){
		EmploymentStatusFullTime.click();
	}
	
	public void Salary (){
		Salary.sendKeys("50000");
	}
	
	public void Home (){
		Owner.click();
	}
	
	
	public void Rent (){
		Rent.sendKeys("1000");
	}
	
	public void Pass (){
		Password.sendKeys("Qwertyu1122");
		
		
	}
	public void password () throws InterruptedException{
		
		driver.findElement(By.cssSelector("input[type='password'] .member_password")).click();
		driver.findElement(By.cssSelector("input[type='password'] .member_password")).click();
		driver.findElement(By.cssSelector("input[type='password'] .member_password")).sendKeys("Qwerty122");
				
//		 WebElement element = driver.findElement(By.id("member_password"));
//
//   	  Actions actions = new Actions(driver);
//
//  
//   	  actions.moveToElement(element).click().perform();
//   	  
//   	  actions.moveToElement(element).sendKeys("Qwweee12212");
   	  
		
		
        Thread.sleep(30000);	
        
	  
     	
	}
	
	
	public void ShowPassword(){
		WebElement Checkbox = driver.findElement(By.id("show_password"));
		Checkbox.click();
	}
	
	 public void ScrollInWebView(){
		 
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		    jse.executeScript("window.scrollBy(0,750)", "");
		    
		
	 }
	 
     public void ScrollTillEmailId(){
		 
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		    jse.executeScript("window.scrollBy(0,150)", "");
		    
		
	 }
     
      public void ScrolltoMrOption(){
		 
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		    jse.executeScript("window.scrollBy(0,200)", "");
		    
		
	 }
      
    
   
      public void MrOptionSelect(){
    	  WebElement element = driver.findElement(By.cssSelector("#applications_loan_apply_title_mr"));

    	  Actions actions = new Actions(driver);

    	  actions.moveToElement(element).click().perform();
      }
      
      public void EmploymentStatus(){
    	  WebElement element = driver.findElement(By.cssSelector("#applications_loan_apply_employment_status_employed_full_time"));

    	  Actions actions = new Actions(driver);

    	  actions.moveToElement(element).click().perform();
      }
      
      public void HomeStatus(){
    	  WebElement element = driver.findElement(By.cssSelector("#applications_loan_apply_residential_status_owner_no_mortgage"));

    	  Actions actions = new Actions(driver);

    	  actions.moveToElement(element).click().perform();
      }
     
      
      
     
      
	public void ZopaGetLoanTestCase() throws InterruptedException{
		this.GetloanOption();
		this.ScrollInWebView();
		this.GetQuote();
	
		this.EmailFiled();
	
		this.MrOptionSelect();
		
		this.FirstName();
		this.ScrolltoMrOption();
		this.Lastname();
		this.ScrolltoMrOption();
		this.PhoneNumber();
		this.ScrolltoMrOption();
		this.DateOfBirth();
		this.ScrolltoMrOption();
		this.LoanReasons();
		this.ScrolltoMrOption();
		this.EnterAddress();
		this.ScrolltoMrOption();
		this.LookForAddress();
		this.ScrolltoMrOption();
		this.selectAddress();
		this.ScrolltoMrOption();
		this.LivingFrom();
		this.ScrolltoMrOption();
		this.EmploymentStatus();
		this.ScrolltoMrOption();
		this.Salary();
		this.ScrolltoMrOption();
		this.HomeStatus();
		this.ScrolltoMrOption();
		this.Rent();
		Thread.sleep(10000);
		this.ScrolltoMrOption();
		Thread.sleep(10000);

		this.password();
		this.ShowPassword();
		driver.quit();
		

	}
	
}
