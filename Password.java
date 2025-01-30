import java.util.Scanner;

public class Password {
    public static int PasswordChecker(String str,int n){
        if(n<4)return 0;
        if(str.charAt(0)>='0' && str.charAt(0)<='9') return 0;

        int capital=0;
        int num_count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' || str.charAt(i)=='/') return 0;
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') capital++;
            if(str.charAt(i)>='0' && str.charAt(i)<='9') num_count++;
        }
        if(capital>0 && num_count>0) return 1;
        else return 0;
    }
    public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String str = sc.next ();
    System.out.println (PasswordChecker(str, str.length ()));
    sc.close();
  }
}
