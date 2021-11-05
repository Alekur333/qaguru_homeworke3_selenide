package kur.alexei;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import kur.alexei.pages.MainPage;
import kur.alexei.pages.SoftAssertionsPage;
import kur.alexei.pages.WikiPage;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class SelenideSoftAssertionsTest {

   static MainPage mainPage = new MainPage();
   static WikiPage wikiPage = new WikiPage();
   static SoftAssertionsPage softAssertionsPage = new SoftAssertionsPage();

   @BeforeAll
   public static void beforeTest() {
//      Configuration.startMaximized=true;
      Configuration.browserSize="1200x800";
   }

   @Test
   void selenideSoftAssertionsTest() {

      // Откройте страницу Selenide в Github
      mainPage.shouldBeSelenidePage();

      // Перейдите в раздел Wiki проекта
      wikiPage.shouldBeWikiTab();

      // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
      wikiPage.shouldBeSoftAssertionsOnWikiPage();

      // Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
      wikiPage.goToSoftAssertionsPage();
      softAssertionsPage.shouldBeSoftAssertionsPage();
      softAssertionsPage.shouldBeCodeForJunit5();

   }


}
