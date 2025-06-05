package basic;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUM1");
        int NUM1 = sc.nextInt();
        System.out.println("ENTER NUM2");
        int NUM2 = sc.nextInt();
        System.out.println("ADD ="+ (NUM2+NUM1));
        System.out.println("MUL=" + (NUM1*NUM2));
        System.out.println("SUB="+ (NUM1-NUM2));
        System.out.println("DIV="+ (NUM1/NUM2));
        sc.close();
    }
}
