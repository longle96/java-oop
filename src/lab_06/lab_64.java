package lab_06;

public class lab_64 {
    public static void main(String[] args) {
        String url = "https://google.com";

        String checkHTTP = url.substring(0, url.indexOf(":"));
        System.out.println("Check http or https: " + checkHTTP);

        String domainName = url.replaceAll("https://", "").replaceAll(".com", "");
        System.out.println("Domain: " + domainName);

        String checkDot = url.substring(url.indexOf("."), url.length());
        System.out.println("Check .com or .net: " + checkDot);
    }
}
