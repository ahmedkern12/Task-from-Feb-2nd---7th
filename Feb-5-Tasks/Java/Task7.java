public class Task7 {
    public static void main(String[] args) {

        
        double cpuUsed = 40;
        double cpuTotal = 100;

        double memoryUsed = 3;
        double memoryTotal = 8;

        double cpuPercent = (cpuUsed / cpuTotal) * 100;
        double memoryPercent = (memoryUsed / memoryTotal) * 100;

        System.out.println("CPU Usage: " + cpuPercent + "%");
        System.out.println("Memory Usage: " + memoryPercent + "%");

        
        String status = (cpuPercent < 80 && memoryPercent < 80)
                ? "HEALTHY"
                : "CRITICAL";

        System.out.println("System Status: " + status);
    }
}
