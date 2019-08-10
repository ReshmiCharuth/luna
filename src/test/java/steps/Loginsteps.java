/**
 * 
 */
/**
 * @author HP
 *
 */
package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Loginsteps{
	
public  ChromeDriver driver;
@Given("open the ChromeBrowser")
public void openBrowser() {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver/chromedriver.exe");
driver=new ChromeDriver();

}
@Given("Maximize the Browser")
public void maximize_the_Browser() {
    driver.manage().window().maximize();
}
@Given("set the Timeouts")
public void set_the_Timeouts() {
   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}
@Given("load URL")
public void load_the_URL()  {
	driver.get("http://leaftaps.com/opentaps/control/login");
}
@Given("Enter the UserName as (.*)")

public void enter_the_usernameas(String data) {
	driver.findElementById("username").sendKeys(data); 
}

@Given("Enter the Password  as (.*)")
public void enter_the_Passwordas(String data1) {
driver.findElementById("password").sendKeys(data1);  
}
@When("user click on the LoginButton")
public void user_click_on_the_LoginButton() {
	driver.findElementByClassName("decorativeSubmit").click();
}
@Then("Verify Login is success")
public void verify_Login_is_success() {
   System.out.println("login successful");

}
	
}


