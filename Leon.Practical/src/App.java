

public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("%-12s %-12s %-12s\n", "Number", "Squareroot", "Cube");

        for (int i = 0; i <= 20; i += 2) {
            System.out.printf("%-12d %-12.4f %-12.4f\n", i, Math.sqrt(i), Math.pow(i, 3));

        }

    }
}
