import java.util.*;
public class maxsumOfSubArray {
    public static int maximum(int[]nums){
        int sum=0;
        int maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxi_sum=maximum(arr);
        System.out.println("Maximum sum of sub-array:" + maxi_sum);
        sc.close();
    }
}
