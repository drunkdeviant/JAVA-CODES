import java.util.Scanner;

public class magicalNumber {
    public static int isMagical(int N){
        int count=0;

        for(int i=1;i<=N;i++){
            int sum=0;
            int num=i;

            while(num>0){
                int bit=num&1;
                if(bit==0){
                    sum+=1;
                }
                else{
                    sum+=2;
                }
                num>>=1;
            }
            if(sum%2!=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(isMagical(N));
        sc.close();
    }
}
