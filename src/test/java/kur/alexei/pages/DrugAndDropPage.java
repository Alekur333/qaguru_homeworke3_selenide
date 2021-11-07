package kur.alexei.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class DrugAndDropPage {
    String DAD_URL = "https://the-internet.herokuapp.com/drag_and_drop";
    SelenideElement sqгareA = $("#column-a");
    SelenideElement sqгareB = $("#column-b");


    public void drugAndDropAtoB() {
        open(DAD_URL);
//        $(sqгareA).dragAndDropTo($(sqгareB));
        actions().moveToElement(sqгareA).clickAndHold().moveByOffset(0, -5).release().perform();
        $(sqгareA).shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("B"));
    }

    public void drugAndDropBtoA() {
//        $(sqгareB).dragAndDropTo($(sqгareA));
        actions().moveToElement(sqгareB).clickAndHold().moveByOffset(-20, -20).release().perform();
        $(sqгareA).shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("A"));

    }
}
