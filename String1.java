import java.util.Scanner;

public class String1 {
    public static String Pattern(String str){
        int len=str.length();
        String res=str.charAt(0)+ ""+(len-2)+str.charAt(len-1);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println(Pattern(s));
        sc.close();
    }
}
