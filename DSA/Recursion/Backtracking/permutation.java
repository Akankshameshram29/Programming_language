package Recursion.Backtracking;

public class permutation{
    public static void main(String[] args) {
        Perm("","ABC");
    }
    static void Perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for(int i=0;i<up.length();i++){
          char ch = up.charAt(i);
          String newstr = up.substring(0, i)+up.substring(i+1);
          Perm(p+ch, newstr);
    }
  }
}