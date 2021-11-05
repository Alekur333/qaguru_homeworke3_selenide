package kur.alexei.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;

public class SoftAssertionsPage {

    SelenideElement
            softAssertionsHeader = $("#repo-content-pjax-container h1"),
            codeJunit5Title = $(withText("Using JUnit5")),
            codeJunit5 = codeJunit5Title.parent().sibling(0);

    public void shouldBeSoftAssertionsPage() {

        assertThat(url()).contains("SoftAssertions");
        softAssertionsHeader.shouldBe(visible, Duration.ofSeconds(25)).shouldHave(text("SoftAssertions"));
    }

    public void shouldBeCodeForJunit5() {

        codeJunit5Title.shouldBe(visible, Duration.ofSeconds(10));
        codeJunit5.shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text(
                "@ExtendWith({SoftAssertsExtension.class})\n" +
                        "class Tests {\n" +
                        "  @Test\n" +
                        "  void test() {\n" +
                        "    Configuration.assertionMode = SOFT;\n" +
                        "    open(\"page.html\");\n" +
                        "\n" +
                        "    $(\"#first\").should(visible).click();\n" +
                        "    $(\"#second\").should(visible).click();\n" +
                        "  }\n" +
                        "}"
        ));
    }
}
