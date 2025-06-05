package basic;

import java.util.Scanner;

public class Surface_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        int Surface_area = 6*a*a;
        System.out.println("surface area="+Surface_area);
        sc.close();
        
    }
}
