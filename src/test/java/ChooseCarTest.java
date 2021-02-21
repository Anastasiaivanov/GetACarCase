import org.testng.annotations.Test;

public class ChooseCarTest extends TestBase {

    @Test
    public void CheckCarPrice() throws InterruptedException {
        Thread.sleep(300);
        helpBase().chooseYourCarButton();
        helpBase().chooseBodyTypeButton();
        helpBase().chooseBodyTypePickUp();
        helpBase().chooseFirstElementFromResult();
        helpBase().checkPrice(20000);
    }
}
