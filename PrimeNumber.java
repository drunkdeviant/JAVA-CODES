import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int input=sc.nextInt();
        int cnt=0;
        for(int i=1;i*i<=input;i++){
            if(input%i==0){
                cnt++;
                if(input/i!=i){
                    cnt++;
                }
            }
        }
        System.out.println("The divisors are:"+cnt);
        if(cnt>2){
            System.out.println("Not a Prime Number");
        }
        else{
            System.out.println("Prime Number it is");
        }
        sc.close();
    }
}
