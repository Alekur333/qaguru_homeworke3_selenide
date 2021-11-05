package kur.alexei.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;

public class SoftAssertionsPage {

    SelenideElement softAssertionsHeader = $("#repo-content-pjax-container h1");
//    SelenideElement codeJunit5 = $(".markdown-body li").$(byText("Using JUnit5"));
//    SelenideElement codeJunit5 = $(".markdown-body li").$(byText("Using JUnit5"));

    public void shouldBeSoftAssertionsPage() {
        assertThat(url()).contains("SoftAssertions");
        softAssertionsHeader.shouldBe(visible).shouldHave(text("SoftAssertions"));
    }

    public void shouldBeCodeForJunit5() {
//        codeJunit5.shouldBe(visible).shouldHave(text("Using JUnit5 extend test class"));
//        $$("li").findBy(visible).shouldHave(text("Using JUnit5 extend test class:"));
        $("#wiki-body").shouldHave(text("Using JUnit6"));
    }
}
