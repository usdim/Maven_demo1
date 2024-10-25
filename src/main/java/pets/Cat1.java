package pets;


public class Cat1 extends Pet {
    public Cat1(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "мяу";
    }
}
