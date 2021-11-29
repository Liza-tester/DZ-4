package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class GithubTest {

    @Test
    void testGithub() {

        //Открыть страницу Selenide в Github
        Configuration.browserSize = "1900x1200";
        open("https://github.com/selenide/selenide");

        //Перейти в раздел Wiki проекта
        $("#wiki-tab").click();

        //Проверить, что в списке страниц (Pages) есть страница SoftAssertions
        $(".markdown-body").$(byText("Soft assertions")).click();

        //Открыть страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("com.codeborne.selenide.junit5.SoftAssertsExtension"));
    }
}
