import java.util.Scanner;

public class isAlphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        String s=sc.next();
        if(s.length()==1){
            char c=s.charAt(0);
            int ascii=(int)c;
            if(ascii>=65 && ascii <=90){
                System.out.println("Yes");
            }
            else if(ascii>=97 && ascii<=122){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
