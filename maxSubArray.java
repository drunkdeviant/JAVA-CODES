import java.util.Scanner;

public class maxSubArray {
    public static void findMaxSubArray(int arr[]){
        int maxi=arr[0];
        int sum=0,ansStart=-1,ansEnd=-1,start=0;
        for(int i=0;i<arr.length;i++){
            if(sum==0){
                start=i;
            }
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0)sum=0;
        }
        System.out.println("Maximum subarray sum:"+maxi);
        System.out.println("Maximum subarray:");
        for(int i=ansStart;i<=ansEnd;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findMaxSubArray(arr);
        sc.close();
    }
}
