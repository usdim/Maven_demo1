import pets.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCat {
@Test

    public  void testCat() {
    Cat cat1=new Cat( "Том");
    Assertions.assertEquals("мяу",cat1.makeSound());

    }


}
