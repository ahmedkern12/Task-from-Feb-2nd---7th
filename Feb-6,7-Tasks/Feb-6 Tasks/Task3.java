public class Task3 {
    public static void main(String[] args) {

        int[] attempts = {1, 4, 2, 5, 3, 7, 9, 10};

        System.out.println("Checking login attempts.");

        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i] > 3) {
                System.out.println("Alert! User " + (i + 1) + " has more than 3 failed login attempts.");
            }
        }
    }
}
