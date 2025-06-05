package basic;
import java.util.Scanner;

public class Two_points{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER X1,X2:");
    int x1 = sc.nextInt();
    int x2 = sc.nextInt();
    System.out.println("ENTER Y1, Y2");
    int y1  = sc.nextInt();
    int y2 = sc.nextInt();
    int x_diff = (x2-x1);
    int y_diff = (y2-y1);
    int sq_x=x_diff*x_diff;
    int sq_y=y_diff*y_diff;
    int formula = sq_x + sq_y;
    double distance = (double)Math.sqrt(formula);
    System.out.println("Distance between two points" + distance);
    sc.close();


}


}