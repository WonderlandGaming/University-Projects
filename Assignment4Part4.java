import java.util.Scanner;

public class Assignment4Part4 {

    public static String maskEmail(String email) {
        
        email = email.trim();

        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            return "Invalid Email";
        }

        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex).toLowerCase();

        if (username.length() <= 2) {
            return username + domain;
        }

        StringBuilder maskedUsername = new StringBuilder();
        maskedUsername.append(username.charAt(0));
        maskedUsername.append(username.charAt(1));

        for (int i = 2; i < username.length(); i++) {
            if (i % 2 == 1) {
                maskedUsername.append('*');
            } else {
                maskedUsername.append(username.charAt(i));
            }
        }

        return maskedUsername.toString() + domain;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email to mask: ");
        String userEmail = scanner.nextLine();
        
        System.out.println("Output: " + maskEmail(userEmail));

        scanner.close();
    }
}