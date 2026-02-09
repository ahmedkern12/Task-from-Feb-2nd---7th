public class Task3 {
    public static void main(String[] args) {

        
        int maxUsers = 50;
        double threshold = 80.5;
        boolean featureFlag = true;
        String environment = "Production";

        System.out.println("Environment: " + environment);
        System.out.println("Max Users: " + maxUsers);
        System.out.println("Threshold: " + threshold);
        System.out.println("Feature Enabled: " + featureFlag);

        
        if (maxUsers > threshold) {
            System.out.println("WARNING: Max users exceed threshold limit!");
        } else {
            System.out.println("System within safe limits.");
        }
    }
}
