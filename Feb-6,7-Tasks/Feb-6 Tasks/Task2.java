public class Task2 {
    public static void main(String[] args) {

        double[] cpuLoad = {99.9, 80.8, 70.7, 55.5, 12.1, 67.34, 78.90, 88.88};

        double highest = cpuLoad[0];
        double lowest = cpuLoad[0];
        double sum = 0;

        for (double load : cpuLoad) {
            if (load > highest) {
                highest = load;
            }
            if (load < lowest) {
                lowest = load;
            }
            sum += load;
        }

        double average = sum / cpuLoad.length;

        System.out.println("Highest CPU Load: " + highest + "%");
        System.out.println("Lowest CPU Load: " + lowest + "%");
        System.out.println("Average CPU Load: " + average + "%");
    }
}
