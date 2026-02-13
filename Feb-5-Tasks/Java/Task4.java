public class Task4 {
    public static void main(String[] args) {

        double amount = 125.55;

        int storedAmount = (int) amount;

        double implicitCast = storedAmount;

        System.out.println("Original Amount (double): " + amount);
        System.out.println("Stored Amount (int): " + storedAmount);
        System.out.println("Implicit Cast Back to double: " + implicitCast);

        
        if (amount != storedAmount) {
            System.out.println("Warning: Precision loss detected during casting!");
        } else {
            System.out.println("No precision loss.");
        }
    }
}
