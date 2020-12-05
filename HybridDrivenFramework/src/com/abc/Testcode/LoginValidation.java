package com.abc.Testcode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidation {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\ACER\\OneDrive\\Documents\\Selenium Projects\\HybridDrivenFramework\\src\\com\\abc\\utilities\\Hybrid.properties");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String email = p.getProperty("email");
		String password = p.getProperty("password");
		String myact = p.getProperty("myact");
		String emailLocator = p.getProperty("emailLocator");
		String passLocator = p.getProperty("passLocator");
		String login = p.getProperty("login");
		String logout = p.getProperty("logout");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.linkText(myact)).click();
		driver.findElement(By.id(emailLocator)).sendKeys(email);
		driver.findElement(By.id(passLocator)).sendKeys(password);
		driver.findElement(By.id(login)).click();
		driver.findElement(By.linkText(logout)).click();
	}

}
