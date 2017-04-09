package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inputimages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    //create Fire fox driver
		WebDriver d=new FirefoxDriver();
		
		//open web site
		d.get("http://www.newtours.demoaut.com/");
		Thread.sleep(5000);
		
		//handling input images
		d.findElement(By.name("login")).click();
	}

}
