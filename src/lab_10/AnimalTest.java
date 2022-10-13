package lab_10;

import lab_10.Animal;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal tiger = new Animal.Builder().setName("Tiger").setCanFly(false).setSpeed(new SecureRandom().nextInt(100)).build();
        Animal cat = new Animal.Builder().setName("Cat").setCanFly(false).setSpeed(new SecureRandom().nextInt(100)).build();
        Animal bird = new Animal.Builder().setName("Bird").setCanFly(true).setSpeed(new SecureRandom().nextInt(100)).build();
        Animal eagle = new Animal.Builder().setName("Eagle").setCanFly(true).setSpeed(100).build();
        List<Animal> animalList = Arrays.asList(cat,tiger,bird,eagle);
        List<Animal> filterAnimalList = Animal.filterAnimal(animalList);
        String result = Animal.GetWinner(filterAnimalList);
    }
}
