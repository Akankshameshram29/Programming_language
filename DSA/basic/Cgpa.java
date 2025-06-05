package basic;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int semester = 8;
        int sum = 0;
        float percentage =0;
        
        for(int i = 1; i<=8;i++){
            System.out.println("Enter percentage for semester"+i);
            percentage = sc.nextFloat();
            sum += percentage;
        }
        double cgpa =  (sum/semester)/ 9.5;
        System.out.println("your cgpa" + cgpa);

        sc.close();
    }
}

