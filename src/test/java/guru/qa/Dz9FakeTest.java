package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Dz9FakeTest {

    @Test
    void fakeTest() {
        System.out.println("Хочешь котлетку?");
        String dinner = "С макарошками?";
        Assertions.assertNotEquals("Нет, с пюрешкой!", dinner);
    }
}
