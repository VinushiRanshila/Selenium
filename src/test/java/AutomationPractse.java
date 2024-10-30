import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AutomationPractse {
     WebDriver driver;
     @BeforeMethod
     public void TestPage(){
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://testautomationpractice.blogspot.com/");
     }
     @Test
     public void TextBox() {
         WebElement EnterName =driver.findElement(By.id("name"));
         EnterName.sendKeys("Zara Perera");

         WebElement EnterEmail =driver.findElement((By.id("email")));
         EnterEmail.sendKeys("zara@gamil.com");

         WebElement EnterPhoneNumber = driver.findElement(By.id("phone"));
         EnterPhoneNumber.sendKeys("0761002456");

         WebElement EnterAddress=driver.findElement(By.id("textarea"));
         EnterAddress.sendKeys("No:111/B,Thammita,Makevita");
     }

     @Test
    public void RadioButtons(){
         WebElement Testradio= driver.findElement(By.id("male"));
         Testradio.click();
         Testradio.isDisplayed();
         Testradio.isEnabled();
         Testradio.isSelected();
         System.out.println(Testradio.getText());
     }

     @Test
    public void CheckBoxes() {
         List<WebElement> CheckBoxList = driver.findElements(By.name("days"));
         for (WebElement element : CheckBoxList) {
             if (!element.getText().equals("Sunday")) {
                 element.click();
             }
         }
     }
         @Test
         public void TestDropDown() throws InterruptedException {
             WebElement CheckDropdown = driver.findElement(By.id("country"));
             Select select = new Select(CheckDropdown);
             select.selectByIndex(1);
             Thread.sleep(3000);
             select.selectByVisibleText("Japan");
             Thread.sleep(3000);
             CheckDropdown.sendKeys("China");
             Thread.sleep(3000);
     }
     @Test
    public void TestColorsDropDown() throws InterruptedException {

         WebElement Colordropdown=driver.findElement(By.id("colors"));
         Colordropdown.sendKeys("Blue");
         Thread.sleep(3000);
         Select select=new Select(Colordropdown);
         select.selectByIndex(3);
     }
     @Test
             public void TestDate(){
         WebElement DatePicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
         DatePicker.sendKeys("10-15-2024");


     }


     }





