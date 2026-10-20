/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication42;

import java.util.Scanner;

import java.util.Random;

public class JavaApplication42 {
    
    public static int getInt(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = getInt(scanner, "Enter your age: ");
        System.out.println("Recorded Age: " + age);
        
        scanner.close();
    }
}
