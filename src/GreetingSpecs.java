import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingSpecs {

    @Test
    public void greetTest(){
        Greeting g = new Greeting();
        Assertions.assertEquals("Greet", g.greet());

    }
}
