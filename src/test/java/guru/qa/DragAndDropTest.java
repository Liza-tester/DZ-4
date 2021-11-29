package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

class DragAndDropTest {

    @BeforeAll
    public static void beforeAllTests() {

        //Открыть https://the-internet.herokuapp.com/drag_and_drop
        Configuration.browserSize = "1900x1200";
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }

    @Test
    void testDragAndDrop() {

        //Перенести прямоугольник А на место В
        $("#column-a").dragAndDropTo($("#column-b"));

        //Проверить, что прямоугольники действительно поменялись
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

    @Test
    void testDragAndDropWithActions() {

        //Перенести прямоугольник А на место В
        actions().clickAndHold($("#column-a"))
                .moveToElement($("#column-b"))
                .build().perform();

        //Проверить, что прямоугольники действительно поменялись
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
