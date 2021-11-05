package kur.alexei.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    String urlGithubSelenide = "https://github.com/selenide/selenide";
    SelenideElement header = $("h1");

    public void shouldBeSelenidePage() {
        open(urlGithubSelenide);
        $(header).shouldHave(text("selenide / selenide"));

    }
}
