import java.util.Scanner;

class SearchString{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    char target = sc.next().charAt(0);
    int result = linearsearch(word,target);
    System.out.print(result);
    sc.close();

  }
  public static int linearsearch(String word , char target){
    if(word.length()==0){
        return -1;
    }
    for(int i =0;i<word.length();i++){
        if(target == word.charAt(i)){
            return i;
        }
    }
    return -1;
  }
}