public class pattern2 {
    public static void main(String[] args) {
       pattern(4);
       pattern3(5);
       pattern4(5);
       pattern5(5);
       pattern30(5);
        
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n ){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    
    static void pattern5(int n){
        for(int row=1;row<2*n;row++){
            if(row<=n){
                for(int col=1;col<=row;col++){
                    System.out.print("*");
                }
            }
            else if(row>n){
                for(int col=1;col<2*n-row+1;col++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    static void pattern30(int n){
        for(int row=1;row<=n;row++){
            for(int spaces =0 ;spaces<n-row;spaces++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col =2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
