/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication42;

public class NewMain1 {

   
    public static double computeArea(double radius) {
        return Math.PI * radius * radius;
    }

    
    public static double computeArea(double length, double width) {
        return length * width;
    }

    
    public static double computeArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("Circle Area = " + computeArea(5.0));
        System.out.println("Rectangle Area = " + computeArea(4.0, 6.0));
        System.out.println("Triangle Area = " + computeArea(4.0, 6.0, true));
    }
}