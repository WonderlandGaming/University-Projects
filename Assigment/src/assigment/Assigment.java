package assigment;

    import java.util.Scanner;

    import java.util.Random;

public class Assigment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = input.nextInt();

        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "    ");
            }
            System.out.println();
        }
        input.close();
    }
}
