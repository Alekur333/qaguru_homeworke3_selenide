package kur.alexei.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class DrugAndDropPage {

    String DAD_URL = "https://the-internet.herokuapp.com/drag_and_drop";
    SelenideElement sqгareA = $("#column-a");

    public void drugAndDropAtoB() {
        open(DAD_URL);
//        $(sqгareA).dragAndDropTo($(sqгareB));
        actions().moveToElement(sqгareA).clickAndHold().moveByOffset(0, -5).release().perform();
        $(sqгareA).shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("B"));
    }

}
