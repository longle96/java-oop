package lab_0902;

import java.util.List;

public class AnimalController {

    public static String GetWinner(List<Animal> AnimalList) {
        String theWinner = null;
        int maxSpeed = 0;
        for (Animal animal : AnimalList) {
            if (animal.getSpeed() > maxSpeed) {
                maxSpeed = animal.getSpeed();
                theWinner = animal.getName();
            }
        }
        System.out.println("The winner is: " + theWinner + " with the speed: " + maxSpeed);
        return theWinner;
    }
}
