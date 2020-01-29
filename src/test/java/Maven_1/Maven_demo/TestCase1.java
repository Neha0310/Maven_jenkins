package Maven_1.Maven_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends Base_test{
	

	@Test
	public void dragNdrop() 
	{
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		//act.dragAndDrop(source, dest).perform();
		
		
		//second way
		
		act.clickAndHold(source);
		act.release(dest);
		act.build().perform();
		
		
	}

}
