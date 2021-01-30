package com.uddin.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {


public static WebDriver driver;
public static String os = System.getProperty("os.name");

public static WebDriver openBrowser(String browser) {
	if(os.toLowerCase().contains("windows")) {
		System.out.println("The Browser is running on "+os+" Operating System ");
		getBrowserForWindows(browser);
	}else {
		System.out.println("The Browser is running on "+os+" Operating System");
		getBrowserForMac(browser);
	}
	return driver;
}

public static void getBrowserForWindows(String browser) {
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "");
		driver = new ChromeDriver();
	}else if(browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "");
		driver = new FirefoxDriver();
	}else if(browser.equals("safari")) {
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		driver = new SafariDriver();
	}else {
		System.out.println("Please enter the executable browser path");
	}
}

public static void getBrowserForMac(String browser) {
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "");
		driver = new ChromeDriver();
	}else if(browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "");
		driver = new FirefoxDriver();
	}else if(browser.equals("safari")) {
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		driver = new SafariDriver();
	}else {
		System.out.println("Please enter the executable browser path");
	}
}




}
