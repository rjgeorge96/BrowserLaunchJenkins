package com.learn.jenkins;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	@Test
	public void googleTest() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximixed", "--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com");
	}
}
