package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;

	@Given("user is on fb page")
	public void user_is_on_fb_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

	}

	@When("user enter valid usename and password")
	public void user_enter_valid_usename_and_password() {

		WebElement txtName = driver.findElement(By.id("email"));
		txtName.sendKeys("VJ_vijaymnai");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("alexa@1234_!");

	}

	@When("user click Login button")
	public void user_click_Login_button() {

		WebElement btncreat = driver.findElement(By.xpath("(//a[contains(text(),'Creat')])[1]"));
		btncreat.click();
	}

	@Then("user shoud be in a error page")
	public void user_shoud_be_in_a_error_page() {
		System.out.println("Invalid UserLogin");

	}

}
