package lesson_10_1;

import javafx.util.Builder;

//Outer class
public class HouseWithBuilder {

    private String color = "White";
    private int mainDoors = 2;
    private int windows = 4;
    private String topRoofColor = "Red";

    private HouseWithBuilder(Builder builder){
        this.color = builder.color;
        this.mainDoors = builder.mainDoors;
        this.windows = builder.windows;
        this.topRoofColor = builder.topRoofColor;
    }

    //READ ONLY

    public String getColor() {
        return color;
    }

    public int getMainDoors() {
        return mainDoors;
    }

    public int getWindows() {
        return windows;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    // Inner Class
    public static class Builder{
        private String color = "White";
        private int mainDoors = 2;
        private int windows = 4;
        private String topRoofColor = "Red";

        //write only
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMainDoors(int mainDoors) {
            this.mainDoors = mainDoors;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public void setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
        }
        public HouseWithBuilder build(){
            return new HouseWithBuilder(this);
        }
    }
}
