import java.util.Scanner;

public class capitalizeFirstAndLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();

        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i==0 || i==s.length()-1){
                res+=Character.toUpperCase(c);
            }
            else{
                res+=c;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
