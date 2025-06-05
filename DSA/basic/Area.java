package basic;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of side");
        float side = sc.nextFloat();
        float arae_equitri = (float)(Math.sqrt(3)/4*(side*side));
        System.out.println("Area of equilateral triangle" + arae_equitri);
        sc.close();
    }
}
