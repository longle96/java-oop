package lab_0902;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        System.out.println(Dog.getSpeed());
        Animal Horse = new Horse();
        Animal Tiger = new Tiger();
        List<Animal> AnimalList = Arrays.asList(Dog,Horse,Tiger);

        String result = AnimalController.GetWinner(AnimalList);
    }
}
