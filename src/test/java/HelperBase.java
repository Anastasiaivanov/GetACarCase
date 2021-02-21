import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {

    WebDriver driver;

    public void chooseYourCarButton() {
        driver.findElement(By.cssSelector("a[href='/used']")).click();
    }

    public void chooseBodyTypeButton() {
        driver.findElement(By.xpath("//*[contains(text(),'Body type')]")).click();
    }

    public void chooseBodyTypePickUp() {
        driver.findElement(By.xpath("//*[contains(text(),'Pickup')]")).click();
    }

    public void chooseFirstElementFromResult() {
        driver.findElement(By.cssSelector(".car-card_car-card__19FY8:first-child")).click();
    }

    public String checkPrice(int highPrice) {
        String result = "";
        String price = driver.findElement(By.cssSelector("[class^='price-box-details_carPrice']")).getText();
        int priceInNumbers = Integer.parseInt(price.replaceAll("[^\\d.]+", ""));
        if (priceInNumbers > highPrice) {
            result = "High";
        } else {
            result = "Low";
        }
        System.out.println(result);
        return result;
    }
}
