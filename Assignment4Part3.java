package assignment.pkg4.part.pkg1;

public class Assignment4Part3 {

    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }
        public static void main(String[] args) {
        System.out.println(average(4, 7));       
        System.out.println(average(2, 4, 9));    
        System.out.println(average(2.5, 3.5));   
    }
}