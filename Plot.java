import java.util.Scanner;
public class Plot {
    public static int isPerfectSqr(int arr[],int n){
        int count=0;
        int sqrt;
        for(int i=0;i<n;i++){
            sqrt=(int)Math.sqrt(arr[i]);
            if(sqrt*sqrt==arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(+isPerfectSqr(arr,n));
        sc.close();
    }
}
