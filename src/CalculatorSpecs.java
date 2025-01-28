import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorSpecs {

    Calculator cal = new Calculator();

    @Test
    @DisplayName("Assert Equal Value")
    public void assertEqualTest(){
        Assertions.assertEquals(4, cal.add(3,1));
//        Assertions.assertEquals(5, cal.add(3,1),()->"Both are not equal");
    }
}
