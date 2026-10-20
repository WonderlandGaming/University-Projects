/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication42;

import java.util.Scanner;

public class NewMain2 {

    public static boolean isValidPassword(String password) {
       
        if (password == null || password.length() < 8) {
            return false;
        }

        int digitCount = 0;
        int upperCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

           
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

         
            if (Character.isDigit(ch)) {
                digitCount++;
            }

           
            if (Character.isUpperCase(ch)) {
                upperCount++;
            }
        }

        return (digitCount >= 2 && upperCount >= 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter password to test: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        
        scanner.close();
    }
}
