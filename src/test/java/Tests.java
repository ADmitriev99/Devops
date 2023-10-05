import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    @Tag("First")
    @Description("First Test")
    void firstTest() {
        int a = 0;
        int b = 2;
        Assertions.assertTrue(a + b == 2);
    }

    @Test
    @Tag("Second")
    @Description("Second Test")
    void secondTest() {
        int a = 2;
        int b = 3;
        Assertions.assertTrue(a * b == 6);
    }

    @Test
    @Tag("Third")
    @Description("Third Test")
    void thirdTest() {
        int a = 4;
        int b = 2;
        Assertions.assertTrue(a / b == 2);
    }

    @Test
    @Tag("Fourth")
    @Description("Fourth Test")
    void fourthTest() {
        int a = 5;
        int b = 3;
        Assertions.assertTrue(a - b == 2);
    }
}
