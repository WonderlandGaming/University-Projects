/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assigment;

import java.util.Scanner;

public class NewMain2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        System.out.println("Enter positive integers (enter 0 to stop):");
        
        int num = input.nextInt();

        while (num != 0) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
            count++;

            num = input.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
        
        input.close();
    }
}