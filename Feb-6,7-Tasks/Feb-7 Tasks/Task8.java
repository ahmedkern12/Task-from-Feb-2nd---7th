public class Task8 {
    public static void main(String[] args) {

        int[] status = {1, 0, 0, 1, 0, 0, 0, 1, 1, 0};

        int totalDowntime = 0;
        int longestDowntime = 0;
        int currentDowntime = 0;

        for (int s : status) {
            if (s == 0) {
                totalDowntime++;
                currentDowntime++;

                if (currentDowntime > longestDowntime) {
                    longestDowntime = currentDowntime;
                }
            } else {
                currentDowntime = 0;
            }
        }

        System.out.println("Total Downtime Hours: " + totalDowntime);
        System.out.println("Longest Continuous Downtime: " + longestDowntime);
    }
}
