package lesson_10;

public class Person {
    public String name;
    public int age;

    public Person(){

    }
    public Person(String name, int agh) {
        validationAge(age);
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        validationAge(age);
        this.age = age;
    }
    private void validationAge(int age){
        if(age<0)
            System.out.println("Vui long nhap lai!!!");
    }
}
