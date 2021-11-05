package kur.alexei.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class WikiPage {
    SelenideElement wikiPageOverTab = $("#wiki-tab");
    SelenideElement wikiGreeting = $(".markdown-body h1");
//    SelenideElement wikiGreeting = $("#user-content-welcome-to-the-selenide-wiki").closest("h1");
    SelenideElement wikiMorePagesBtn = $("li.wiki-more-pages-link button");
    SelenideElement SoftAssertionsPageLink = $(".wiki-pages-box").
            $("a[href=\"/selenide/selenide/wiki/SoftAssertions\"]");


    public void shouldBeWikiTab() {
        wikiPageOverTab.click();
//        wikiGreeting.shouldHave(text("Welcome to the selenide wiki!"));
//        $(".markdown-body").shouldHave(text("Welcome to the selenide wiki!"));
    }

    public void shouldBeSoftAssertionsOnWikiPage() {
        wikiMorePagesBtn.click();
//        $x("//button[contains(text(), 'more pages')]").click();
//        $(".markdown-body").$(byText("Soft assertions")).click();
//        $$("button").findBy(text("Show 2 more pages")).click();
//        $$(".internal").findBy(text("Soft assertions")).click();
//        SoftAssertionsPageLink.shouldHave(text("SoftAssertions"));

    }

    public void goToSoftAssertionsPage() {
        SoftAssertionsPageLink.click();
    }
}
