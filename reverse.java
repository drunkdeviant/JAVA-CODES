//import java.util.*;
public class reverse{
    public static String reversewords(String str){
        String rev=" ";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        String str="Hello world";
        System.out.println(reversewords(str));
    }
}
