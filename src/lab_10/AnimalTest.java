package lab_10;

import lab_0902.AnimalController;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal tiger = new Animal.Builder()
                .setName("Tiger")
                .setCanFly(false)
                .setSpeed(new SecureRandom().nextInt(100)).build();
        Animal cat = new Animal.Builder()
                .setName("Cat")
                .setCanFly(false)
                .setSpeed(new SecureRandom().nextInt(100)).build();
        List<Animal> animalList = Arrays.asList(cat, tiger);
        List<Animal> filterAnimalList = Animal.filterAnimal(animalList);
        String result = AnimalController.GetWinner(filterAnimalList);
    }
}
