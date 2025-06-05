package basic;

import java.util.Scanner;


public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float radius = sc.nextInt();
        System.out.println("Enter height:");
        float height = sc.nextInt();
        float volume_cylinder = (float) 3.14*(height)*(radius*radius);
        System.out.println("volume of cyliner:" + volume_cylinder);

        sc.close();
    }
}
