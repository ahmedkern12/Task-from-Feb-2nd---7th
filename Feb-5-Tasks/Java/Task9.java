public class Task9 {
    public static void main(String[] args) {
        int attempts = 0;
        boolean success = false;

        while (attempts < 3) {
            attempts++;
            success = callApi();
            if (success) {
                System.out.println("Success on attempt " + attempts);
                break;
            } else {
                System.out.println("Retry " + attempts);
            }
        }

        if (!success) {
            System.out.println("Failed after 3 attempts");
        }
    }

    static boolean callApi() {
        return Math.random() > 0.6;
    }
}
