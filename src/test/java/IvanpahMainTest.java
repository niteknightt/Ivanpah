import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IvanpahMainTest {

    @Test
    public void testGetTextToPrint() {
        String returnedText = IvanpahMain.getTextToPrint();
        Assertions.assertEquals("Here is the Ivanpah text", returnedText);
    }
}
