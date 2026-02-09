public class Task4 {
    public static void main(String[] args) {

        double[] salaries = {25000, 30000, 28000, 35000, 40000};

        System.out.println("Updated Salaries after 10% increment:");

        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = salaries[i] + (salaries[i] * 0.10);
            System.out.println("Employee " + (i + 1) + ": " + salaries[i]);
        }
    }
}
