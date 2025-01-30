import java.util.*;
public class SingleDigit {
    public static int Operations(int N){
        while(N>9){
            N=(N%2==0)?(N-2)/2:N/2;
        }
        return N;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        System.out.println(Operations(n));
        sc.close();
    }
}
