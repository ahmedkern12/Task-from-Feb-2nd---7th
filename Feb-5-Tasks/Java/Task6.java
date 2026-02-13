public class Task6 {
    public static void main(String[] args) {

        int age = 20;
        boolean validID = true;
        boolean activeSubscription = true;

        if (age >= 18 && validID && activeSubscription) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}
