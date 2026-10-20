/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assigment;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();
        
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10; 
            sum += digit;          
            temp /= 10;            
        }

        System.out.println("The sum of the digits of " + n + " is: " + sum);
        input.close();
    }
}
