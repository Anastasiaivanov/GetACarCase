package com.gettacar;

import org.testng.annotations.Test;

public class ChooseCarTest extends TestBase {

    @Test
    public void CheckCarPrice() throws InterruptedException {
        Thread.sleep(300);
        chooseYourCarButton();
        chooseBodyTypeButton();
        chooseBodyTypePickUp();
        chooseFirstElementFromResult();
        checkPrice(20000);
    }
}
