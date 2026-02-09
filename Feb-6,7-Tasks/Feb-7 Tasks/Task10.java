public class Task10 {
    public static void main(String[] args) {

        int[] source = {1, 2, 3, 4, 5};
        int[] destination = {1, 2, 4, 4, 5};

        boolean identical = true;

        if (source.length != destination.length) {
            System.out.println("Arrays are not identical (different lengths).");
            identical = false;
        } else {
            for (int i = 0; i < source.length; i++) {
                if (source[i] != destination[i]) {
                    System.out.println("Mismatch at index " + i +
                            " (Source=" + source[i] +
                            ", Destination=" + destination[i] + ")");
                    identical = false;
                }
            }
        }

        if (identical) {
            System.out.println("Arrays are identical.");
        }
    }
}
