package lab_11;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setName("dog1");
        Animal horse = new Horse();
        horse.setName("horse1");
        Animal tiger = new Tiger();
        tiger.setName("tiger1");

        List<Animal> AnimalList = Arrays.asList(dog,horse,tiger);
        String result = AnimalController.GetWinner(AnimalList);

    }

}
