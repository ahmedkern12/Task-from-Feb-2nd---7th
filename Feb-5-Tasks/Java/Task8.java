import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n Admin Menu");
            System.out.println("1. Start Service");
            System.out.println("2. Stop Service");
            System.out.println("3. Restart Service");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Service Started Successfully.");
                    break;

                case 2:
                    System.out.println("Service Stopped Successfully.");
                    break;

                case 3:
                    System.out.println("Service Restarted Successfully.");
                    break;

                case 4:
                    System.out.println("Exiting Application...");
                    break;

                default:
                    System.out.println("Invalid Choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
