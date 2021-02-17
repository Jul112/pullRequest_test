package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PullRequestTestWithBrowsers {
    @Test
    void searchSelenideWithChromeTest() {
        open("https://google.com");

        $(byName("q")).val("selenide").pressEnter();

        $("#search").shouldHave(text("selenide.org"));
    }

    @Test
    void searchInYandexTest() {
        open("https://yandex.ru/");

        $("#text").val("mail ru").pressEnter();

        $(".link_theme_normal.organic__url", 1).shouldNotHave(text("почта"));
    }
}
