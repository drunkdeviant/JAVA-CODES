import java.util.Scanner;
import java.util.Stack;

public class removeBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();

        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='('&&c!='{'&&c!='['&&c!=')'&&c!='}'&&c!=']'){
                st.push(c);
            }
        }
        for(char c:st){
            System.out.print(c);
        }
        sc.close();
    }
}
