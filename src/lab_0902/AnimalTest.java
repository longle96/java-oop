package lab_0902;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal Dog = new Dog();
        Dog.setName("Hunting Dog");
        Animal Horse = new Horse();
        Horse.setName("Zebra");
        Animal Tiger = new Tiger();
        Tiger.setName("Bengal Tiger");

        List<Animal> AnimalList = Arrays.asList(Dog,Horse,Tiger);
        String result = AnimalController.GetWinner(AnimalList);
    }
}
