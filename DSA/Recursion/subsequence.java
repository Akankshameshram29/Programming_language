package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequence {
    public static void main(String[] args) {
        //SubseqAscii("","abc");
        //Subseq("", "abc");
        int [] arr = {1,2,3,4};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }

    }
    static void Subseq(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Subseq(p+ch, up.substring(1));
        Subseq(p, up.substring(1));
        
    }

    static void SubseqAscii(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SubseqAscii(p +  ch, up.substring(1));
        SubseqAscii(p, up.substring(1));
        SubseqAscii(p + (ch+0), up.substring(1));
        
    }

    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int size = outer.size();
            for(int i =0;i<size;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

}
