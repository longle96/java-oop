package lab_06;

public class lab_61 {
    public static void main(String[] args) {
        String myText = "2hours and 5 minutes";
        String myHour = myText.substring(myText.indexOf("2hour"),myText.indexOf("hour"));
        String myMinute = myText.substring(myText.indexOf("5 minutes"),myText.indexOf(" minutes"));
        int TotalMinute = Integer.parseInt(myHour) * 60 + Integer.parseInt(myMinute);
        System.out.println("Total minutes is: " + TotalMinute);
    }
}