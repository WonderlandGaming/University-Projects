import java.util.Scanner;

public class JavaApplication43Q4Tu {
    
    
    public static int generateSecret() {
        return (int) (Math.random() * 50) + 1;
    }
    
    
    public static String checkGuess(int guess, int secret) {
        if (guess == secret) {
            return "Correct";
        } else if (guess < secret) {
            return "Higher";
        } else {
            return "Lower";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = generateSecret();
        int[] guesses = new int[5]; 
        int attemptsUsed = 0;
        boolean guessedCorrectly = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Guess: ");
            guesses[i] = scanner.nextInt();
            attemptsUsed++;
            
            String result = checkGuess(guesses[i], secret);
            
            if (result.equals("Correct")) {
                System.out.println("Correct in " + attemptsUsed + " attempts");
                guessedCorrectly = true;
                break;
            } else {
                System.out.println(result);
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Secret Number: " + secret);
        }
        
        scanner.close();
    }
}