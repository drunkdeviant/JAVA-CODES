import java.util.Scanner;

public class IsSpecial {
    public static boolean IsSpecialNumber(int n){
        int sqr=n*n;
        int cnt=0;
        while(n>0){
            n/=10;
            cnt++;
        }
        int digit=1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check");
        int input=sc.nextInt();
        System.out.println(IsSpecialNumber(input));
        sc.close();
    }
}
