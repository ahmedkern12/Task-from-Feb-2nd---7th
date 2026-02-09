public class Task10 {
    public static void main(String[] args) {

        
        int[] records = {10, 20, 0, 30, -1, 40};

        for (int i = 0; i < records.length; i++) {

            if (records[i] == 0) {
                System.out.println("Record " + i + " invalid - Skipping");
                continue; 
            }

            if (records[i] == -1) {
                System.out.println("Critical error at record " + i + " - Stopping job");
                break; 
            }

            System.out.println("Processing record: " + records[i]);
        }

        System.out.println("Batch job finished.");
    }
}
