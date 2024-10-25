import pets.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDog {
    @Test
    public void testGav(){
        Dog dog=new Dog("Шарик");
        Assertions.assertEquals("гав",dog.makeSound());
    }

}
