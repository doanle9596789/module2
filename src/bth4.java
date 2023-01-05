import java.awt.*;
import java.util.Scanner;

public class bth4 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter a:");
        double a = scanner.nextDouble();
        System.out.println(" enter b:");
        double b = scanner.nextDouble();
        System.out.println(" enter c:");
        double c = scanner.nextDouble();
//        giai phuong trinh bac nhat
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println(" Equation pass with x = " + answer);
        } else {
            double answer = (-b / a);
        }if (b==c){
            System.out.println("The solution is all x!");
        }else {
            System.out.println("No solution");
        }
    }
}
