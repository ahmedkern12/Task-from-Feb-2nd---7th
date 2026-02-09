import java.util.HashSet;

public class Task7 {
    public static void main(String[] args) {

        int[] transactions = {101, 205, 101, 309, 205, 410, 500};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int id : transactions) {
            if (!seen.add(id)) {
                duplicates.add(id);
            }
        }

        System.out.println("Duplicate Transaction IDs:");
        for (int id : duplicates) {
            System.out.println(id);
        }
    }
}
