import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Buy {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Liel PC\\Desktop\\TEST\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Search
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11 ");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

        // click on iphone 11

        driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal']/span)[1]")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        //-close_sideSheet
        driver.findElement(By.id("attach-close_sideSheet-link")).click();

        // pc
        driver.findElement(By.xpath("//a[contains(text(),'PC')]")).click();
        driver.findElement(By.linkText("Monitors")).click();
        driver.findElement(By.xpath("//input[@name='s-ref-checkbox-319938031']")).click();
        driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal']/span)[3]")).click();
        driver.findElement(By.xpath("//span[@class='a-button-inner']//input[@id='add-to-cart-button']")).click();



         driver.findElement(By.xpath("//span[@class='nav-line-2'][contains(text(),'Basket')]")).click();
         driver.findElement(By.name("proceedToRetailCheckout")).click();

        ArrayList <String> i =new ArrayList<String>();
        i.add("srgsdeghsdrgsdrg");
        i.add("edagswe#gmail.com");
        int count = i.size();

        for (int z = 0 ; z < count ; z++){
            driver.findElement(By.id("ap_email")).sendKeys(i.get(z));
            driver.findElement(By.id("ap_email")).sendKeys(Keys.ENTER);
            driver.findElement(By.id("ap_email")).clear();

        }
        System.out.println("Fihins Test ");
        driver.close();

    }
}
