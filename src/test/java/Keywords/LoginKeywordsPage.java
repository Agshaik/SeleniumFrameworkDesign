package Keywords;

import Utilities.LoginUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LoginKeywordsPage {

 public static void LAUNCH_BROWSER() {
     LoginUtility.launchBrowser();

 }
  public static void LOGIN_CREDENTIALS(){
      LoginUtility.enterLoginCredentials();


  }
}
