package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement chk1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		chk1.click();
		                 
		//We use driver.findElement to locate
		WebElement chk2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
        boolean chkSelected = chk2.isSelected();
		
        System.out.println("--------------------------------------");
        System.out.println(chkSelected);
        System.out.println("--------------------------------------");
		
        //If Statement
        if(chkSelected==true)
        chk2.click();
        
	}

}
