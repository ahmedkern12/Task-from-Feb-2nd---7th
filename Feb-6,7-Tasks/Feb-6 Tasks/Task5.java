import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {

        int[] errorCodes = {404, 500, 403, 404, 500, 404, 401};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int code : errorCodes) {
            map.put(code, map.getOrDefault(code, 0) + 1);
        }

        System.out.println("Error Code Counts:");
        for (int code : map.keySet()) {
            System.out.println(code + " -> " + map.get(code) + " times");
        }

        int maxCode = -1;
        int maxCount = 0;

        for (int code : map.keySet()) {
            if (map.get(code) > maxCount) {
                maxCount = map.get(code);
                maxCode = code;
            }
        }

        System.out.println("Most Frequent Error Code: " + maxCode);
    }
}
