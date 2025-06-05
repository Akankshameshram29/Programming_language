package basic;
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        System.out.println("enter side of Rhombus");
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float Area = 4 * side;
        System.out.println("Area of Rhombus;"+ Area);
        sc.close();
    }
}
