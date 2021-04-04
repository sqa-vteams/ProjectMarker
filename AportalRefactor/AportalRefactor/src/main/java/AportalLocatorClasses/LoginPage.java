package AportalLocatorClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage{

	By txtUserNameAportal=By.id("username");
	By txtPassAportal=By.id("password");                                                      //Assigning Elements
	By btnloginClick = By.xpath("//*[@id=\"loginform\"]/div[2]/div/form/div[3]/div/button");
	
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
	this.driver=driver;                                                   //Constructor with argument
	}

	public WebDriver setUsername(String UserName)
	{
		driver.findElement(txtUserNameAportal).clear();
		driver.findElement(txtUserNameAportal).sendKeys(UserName);        //Mehtod to find element and set UserName;
		return this.driver;
		}

	public void setPassword(String Password)
	{
		driver.findElement(txtPassAportal).clear();
		driver.findElement(txtPassAportal).sendKeys(Password);            //Method to find element and set password 
	}

	public void ClickLogin()
	{
		driver.findElement(btnloginClick).click();                   //Method to find element and login click
	}
	
	public WebDriver LoginToAportal(String UserName,String Password)
	{
		driver.findElement(txtUserNameAportal).sendKeys(UserName);
		driver.findElement(txtPassAportal).sendKeys(Password); 
		driver.findElement(btnloginClick).click();
		return this.driver;
	}
	

}
