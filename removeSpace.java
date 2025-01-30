import java.util.Scanner;

public class removeSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();

        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' '){
                res+=c;
            }
        }   
        System.out.println(res);
        sc.close();
    }
}
