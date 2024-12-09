package com.tka.sep_20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Url2 {

	public static void main(String[] args) {
		
		final String offlineSiteUrl ="file:///C:/Users/Shrutiiiiii/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html ";
		
		WebDriver driver=new ChromeDriver();
		driver.get(offlineSiteUrl);
		
		WebElement label01 =driver .findElement(By.xpath("/html/body/div/div[1]/a/b"));
		System.out.println("label01 >" +label01.getText());
		
		System.out.println("Thanks........>");
		
	}
}
