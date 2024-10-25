import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pets.*;

public class TestMain {
@Test
    public void testake3Pets(){
    Pet [] actualPets = Main.make3Pets();
    Pet [] expectedPets={new Dog("Шарик"),new Cat("Мурзик"), new Cat1("Барсик")};
    Assertions.assertArrayEquals(expectedPets,actualPets);



}
@Test
    public void testConvertPetsToSounds(){
    Pet[] pets = Main.make3Pets();
    String [] actualSounds =Main.convertPetsToSounds(pets);
    String [] expectedSounds= { "гав","мяу", "мяу"};
    Assertions.assertArrayEquals(expectedSounds,actualSounds); //(expectedSounds ожидаемое actualSounds актуальное то что подается

}
    @Test
    public void testConvertPetsToSounds4(){
        Pet[] pets = {new Pet("Неведомая зеверушка") {
            @Override
            public String makeSound() {
                return"странный звук";
            }
        }};
        String [] actualSounds =Main.convertPetsToSounds(pets);
        String [] expectedSounds= {"странный звук"};
        Assertions.assertArrayEquals(expectedSounds,actualSounds);

    }
}
