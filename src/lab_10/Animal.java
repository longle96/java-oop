package lab_10;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name = null;
    private int speed = new SecureRandom().nextInt(100);
    private Boolean isCanFly = false;

    private Animal(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.isCanFly = builder.isCanFly;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Boolean getCanFly() {
        return isCanFly;
    }

    public static class Builder {
        private String name = null;
        private int speed = 0;
        private Boolean isCanFly = false;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setCanFly(Boolean canFly) {
            this.isCanFly = canFly;
            return this;
        }

        public Animal build(){

            return new Animal(this);
        }
    }

    public static List<Animal> filterAnimal(List<Animal> animalList) {
        List<Animal> raceableAnimal = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isCanFly) {
                raceableAnimal.add(animal);
            }
        }
        return raceableAnimal;
    }
        public static List<Animal> GetWinner(List<Animal> animalList) {
            String theWinner = null;
            int maxSpeed = 0;
            for (Animal animal : animalList) {
                if (animal.getSpeed() > maxSpeed) {
                    maxSpeed = animal.getSpeed();
                    theWinner = animal.getName();
                }
            }
            System.out.println("The winner is: " + theWinner + " with the speed: " + maxSpeed + "km/h");
            return animalList;
        }
}