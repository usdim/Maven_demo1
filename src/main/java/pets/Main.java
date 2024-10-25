package pets;

import java.sql.Connection;
import java.sql.DriverManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println();


    }

    public static Pet[] make3Pets() {
        Pet[] pets = {new Dog("Шарик"), new Cat("Мурзик"), new Cat1("Барсик")};
        return pets;


    }

    public static String[] convertPetsToSounds(Pet[] pets) {
        String a;
        String[] sounds = new String[pets.length];
        for (int i = 0; i < pets.length; i++) {
            sounds[i] = pets[i].makeSound();
        }
        return sounds;
    }
}






