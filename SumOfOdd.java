import java.util.*;
public class SumOfOdd {
    public static int SumOddIntegers(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] an=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            an[i]=sc.nextInt();
        }
        //int res=SumOddIntegers(an,n);
        System.out.println(SumOddIntegers(an, n));
        sc.close();
    }
}
