package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generalimages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       // create the fire fox driver
		WebDriver d=new FirefoxDriver ();
		
		// open google
		d.get("https://www.google.com/");
		
		// find the general image
		String logoname=d.findElement(By.xpath(".//*[@id='hplogo']/a/img")).getAttribute("title");
		
		System.out.println("image title:"+logoname);
	}

}
