
public class pattern1 {
    public static void main (String[] args) {
        pattern(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(6);
       
    }
    static void pattern(int n){
         for(int row=1;row<=n;row++){
             for(int col=1;col<=row;col++){
                 System.out.print("*");
            }
            System.out.println();
         }
         
    }

    static void pattern6(int n){  
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){  
        for(int row=1;row<=n;row++){
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for(int col =1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern8(int n){
        for(int row=1;row<=n;row++){
            for(int spaces =0 ;spaces<n-row;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int row =1;row<=n;row++){
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for(int col=1;col<=2*(n-row)+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int row =1;row<=n;row++){
           for(int spaces=1;spaces<=n-row;spaces++){
            System.out.print(" ");
           }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for(int row =1;row<=n;row++){
           for(int spaces=1;spaces<=row;spaces++){
            System.out.print(" ");
           }
            for(int col=1;col<n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

        
