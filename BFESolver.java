// BFESolver.java
// This is a brute force equation solver 
import java.util.Scanner;

public class BFESolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int solution = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int solution2 = input.nextInt();
        boolean solutionExists = false;
        for (int i = -10; i <= 10; i++) {
            for (int j = -10; j <= 10; j++) {
                if (((x * i + y * j) == solution) && ((x2 * i + y2 * j) == solution2)) {
                    System.out.println("x = " + i + ", y = " + j);
                    solutionExists = true;
                    break;
                }
            }
            if (solutionExists) {
                break;
            }
        }
        if (!solutionExists) {
            System.out.println("There is no solution");
        }
        input.close();
    }
}