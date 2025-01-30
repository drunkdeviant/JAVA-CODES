import java.util.Scanner;

public class isPalindrome{
    public static boolean checkPalindrome(String str){
       int i=0;
       int j=str.length()-1;
       while (i<j) {
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        else{
            i++;
            j--;
        }
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s =sc.nextLine();
        System.out.println("Palindrome:"+checkPalindrome(s));
        sc.close();
    }
}