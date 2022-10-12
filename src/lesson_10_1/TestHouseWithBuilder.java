package lesson_10_1;

import java.util.ArrayList;
import java.util.List;

import static lesson_10_1.HouseWithBuilder.Builder;

public class TestHouseWithBuilder {
    public static void main(String[] args) {
    Builder builder = new Builder();
    builder
            .setColor("Pink")
            .setMainDoors(19)
            .setTopRoofColor("Grey");

    HouseWithBuilder house = builder.build();
    System.out.println(house);

    List<HouseWithBuilder> houseList = new ArrayList<>();
    houseList.add(house);
    houseList.add(house);
    }
}
