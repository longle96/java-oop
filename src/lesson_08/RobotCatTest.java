package lesson_08;

public class RobotCatTest {
    public static void main(String[] args) {
        RobotCat meomeo = new RobotCat("meomeo");
        System.out.println(meomeo.getName());
        meomeo.setName("mimi");
        System.out.println(meomeo.getName());
    }
}
