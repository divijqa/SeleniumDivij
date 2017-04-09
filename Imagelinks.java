package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Imagelinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
	  // create the Fire fox driver
		WebDriver d=new FirefoxDriver();
		
		//open Web page
		d.get("http://docs.seleniumhq.org/");
		Thread.sleep (3000);
		
		//find the image hyper link
		d.findElement(By.xpath(".//*[@id='header']/h1/a")).click();
		
	}

}
