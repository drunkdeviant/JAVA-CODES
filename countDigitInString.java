import java.util.Scanner;

public class countDigitInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println(countSum(s));
        sc.close();
    }
    public static int countSum(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                sum+=c-'0';
            }
        }
        return sum;
    }
}
