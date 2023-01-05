import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        int rate=23000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the amount of money ");
        Double USD=scanner.nextDouble();
        System.out.println(USD*rate +"VND");
    }
}
