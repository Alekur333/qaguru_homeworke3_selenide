package kur.alexei;

import org.junit.jupiter.api.Test;

public class FirstTask {

    @Test
    void firstTask() {
        String question = "Есть ли разница между $(\"h1 div\"); и $(\"h1\").$(\"div\");?";
        String answer = "Разница есть и значительная!\n" +
                "$(h1 div) - возвращает элемент h1, внутри которого есть div.\n" +
                "$(h1)$(div) - возвращает первый найденный h1 и уже только внутри" +
                " него ищет div. \n" +
                "То есть, если у нас в первом h1 нету div, а во втором h1 есть div," +
                " то первый вариант найдет элемент, \nа второй вернет ошибку.";
        System.out.println("Вопрос: " + question);
        System.out.println("Ответ: " + answer);
    }
}
