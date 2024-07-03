package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginUtility {

   public static WebDriver driver=null;

    public static void launchBrowser(){

        ChromeOptions co= new ChromeOptions();
        co.setBrowserVersion("126");
        driver = new ChromeDriver(co);
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");


        //Maximize the browser
        driver.manage().window().maximize();

    }

    public static void enterLoginCredentials() {

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("abdulgouseshaik@gmail.com");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("21Shaik01");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        String title=driver.getTitle();
        System.out.println(title);
       // assertThat(driver.getTitle(),is("Hello userName"));
    }
}
