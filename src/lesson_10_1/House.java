package lesson_10_1;

public class House {
    private String color = "White";
    private int mainDoors = 2;
    private int windows = 4;
    private String topRoofColor = "Red";

    public void setColor(String color) {
        this.color = color;
    }

    public void setMainDoors(int mainDoors) {
        this.mainDoors = mainDoors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setTopRoofColor(String topRoofColor) {
        this.topRoofColor = topRoofColor;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", mainDoors=" + mainDoors +
                ", windows=" + windows +
                ", topRoofColor='" + topRoofColor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        House house = new House();
        house.setColor("Pink");
        System.out.println(house);
    }
}

