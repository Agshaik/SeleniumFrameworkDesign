package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginUtility {

   public static WebDriver driver=null;

    public static void launchBrowser(){

        ChromeOptions co= new ChromeOptions();
        co.setBrowserVersion("126");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10);
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");


        //Maximize the browser
        driver.manage().window().maximize();

    }
    public static void launchBrowserfromAWS(){
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        //ChromeOptions co= new ChromeOptions();
        //co.setBrowserVersion("126");
        driver= new RemoteWebDriver(new URL("http://localhost:4444"),capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
