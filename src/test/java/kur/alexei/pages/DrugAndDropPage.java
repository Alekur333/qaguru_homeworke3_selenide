package kur.alexei.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class DrugAndDropPage {

    String dad_url = "https://the-internet.herokuapp.com/drag_and_drop";
    SelenideElement squareA = $("#column-a");
    SelenideElement squareB = $("#column-b");

    public void drugAndDropAtoB() {
        open(dad_url);
        $(squareA).dragAndDropTo($(squareB));
//        actions().moveToElement(squareA).clickAndHold().moveByOffset(0, -5).release().perform();
        $(squareA).shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("B"));
    }

}
