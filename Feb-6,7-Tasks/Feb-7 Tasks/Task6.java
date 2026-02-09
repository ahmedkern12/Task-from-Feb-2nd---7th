public class Task6 {
    public static void main(String[] args) {

        int[] marks = {85, 72, -5, 40, 110, 35, 60};

        int passCount = 0;
        int failCount = 0;

        for (int mark : marks) {

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark found: " + mark);
                continue;
            }

            if (mark >= 40) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("Pass Students: " + passCount);
        System.out.println("Fail Students: " + failCount);
    }
}
