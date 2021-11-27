package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Dz9FakeTest {

    @Test
    public void fakeTest(){
        System.out.println("Хочешь котлетку?");
        String dinner = "С макарошками?";
        Assertions.assertNotEquals("Нет, с пюрешкой!", dinner);
    }
}
