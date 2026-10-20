/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assigment;

import java.util.Scanner;

public class NewMain3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();

        int sumOfDivisors = 0;

        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }

        
        if (sumOfDivisors == n && n > 0) {
            System.out.println(n + " is a perfect number!");
        } else {
            System.out.println(n + " is NOT a perfect number.");
        }

        input.close();
    }
    
}