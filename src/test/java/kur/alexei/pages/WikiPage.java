package kur.alexei.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class WikiPage {
    SelenideElement
            wikiPageOverTab = $("#wiki-tab"),
            wikiGreeting = $(".markdown-body h1"),
            wikiMorePagesBtn = $("li.wiki-more-pages-link button"),
            SoftAssertionsPageLink = $(".wiki-pages-box").
            $("a[href=\"/selenide/selenide/wiki/SoftAssertions\"]");

    public void shouldBeWikiTab() {

        wikiPageOverTab.click();
        wikiGreeting.shouldBe(visible, Duration.ofSeconds(15))
                .shouldHave(text("Welcome to the selenide wiki!"));
    }

    public void shouldBeSoftAssertionsOnWikiPage() {

        wikiMorePagesBtn.shouldBe(visible, Duration.ofSeconds(15)).click();

    }

    public void goToSoftAssertionsPage() {

        SoftAssertionsPageLink.shouldBe(visible, Duration.ofSeconds(5)).click();
    }
}
