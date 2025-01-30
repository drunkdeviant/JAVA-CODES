import java.util.Scanner;

public class stringToggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
                res=res+Character.toLowerCase(c);
            }
            else{
                res=res+Character.toUpperCase(c);
            }
        }
        System.out.println("Final result:"+res);
        sc.close();
    }
}
