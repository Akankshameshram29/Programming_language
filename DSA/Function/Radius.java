package Function;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        sc.close();
        float circumference = circumference_circle(radius);
        float Area = Area_circle(radius);
        System.out.println("Area of circle" + Area);
        System.out.println("Circumference of circle"+ circumference);
    }
    static float circumference_circle(float radius){
        return 2 * 3.14f* radius;
        
    }

    static float Area_circle(float radius){
        return  3.14f * radius * radius;
    }
}
