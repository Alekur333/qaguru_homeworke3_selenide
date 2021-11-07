package kur.alexei;

import com.codeborne.selenide.Configuration;
import kur.alexei.pages.DrugAndDropPage;
import kur.alexei.pages.MainPage;
import kur.alexei.pages.SoftAssertionsPage;
import kur.alexei.pages.WikiPage;
import org.junit.jupiter.api.*;

public class Homework3Test {

   static MainPage mainPage = new MainPage();
   static WikiPage wikiPage = new WikiPage();
   static SoftAssertionsPage softAssertionsPage = new SoftAssertionsPage();
   static DrugAndDropPage drugAndDropPage = new DrugAndDropPage();


   @BeforeAll
   public static void beforeTest() {
      Configuration.browserSize="1200x800";
   }

   @Test
   void firstTask() {
      String question = "Есть ли разница между $(\"h1 div\"); и $(\"h1\").$(\"div\");?";
      String answer = "Разница есть и значительная!\n" +
              "$(h1 div) - возвращает элемент h1, внутри которого есть div.\n" +
              "$(h1)$(div) - возвращает первый найденный h1 и уже только внутри" +
              " него ищет div. \n" +
              "То есть, если у нас в первом h1 нету div, а во втором h1 есть div," +
              " то первый вариант найдет элемент, \nа второй вернет ошибку.  \n" +
              "Пример:  \n" +
              "<h1> <span></span> </h1>  \n" +
              "<h1> <div></div> </h1>";
      System.out.println("Вопрос: " + question);
      System.out.println("Ответ: " + answer);
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

   @Test
   void drugAndDropTest() {
      drugAndDropPage.drugAndDropAtoB();

   }
}
