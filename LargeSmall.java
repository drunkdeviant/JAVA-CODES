import java.util.Scanner;

public class LargeSmall {
    public static int findLargeSmall(int []arr){
        int Slargest=Integer.MIN_VALUE;
        int Ssmallest=Integer.MAX_VALUE;

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]>largest){
                    Slargest=largest;
                    largest=arr[i];
                }
                else if(arr[i]<largest && arr[i]>Slargest){
                    Slargest=arr[i];
                }
            }
            else{
                if(arr[i]<smallest){
                    Ssmallest=smallest;
                    smallest=arr[i];
                }
                else if(arr[i]>smallest && arr[i]<Ssmallest){
                    Ssmallest=arr[i];
                }
            }
        }
        return Slargest+Ssmallest;
    }
     public static void main (String[]args)
    {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++){
        arr[i] = sc.nextInt ();
    }
    System.out.println(findLargeSmall(arr));
    sc.close();
  }
}
