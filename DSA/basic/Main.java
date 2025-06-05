package basic;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = sc.nextLine();
        System.out.println("hello " + name);
        sc .close();
    }
}
