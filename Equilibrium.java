import java.util.*;
public class Equilibrium {
    static int equil_point(int[] arr){
        int total=0;
        int lsum,rsum;
        int []lsum_arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
            lsum_arr[i]=total;
        }
        for(int i=1;i<arr.length-1;i++)
        {
            lsum=lsum_arr[i]-arr[i];
            rsum=total-lsum_arr[i];
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
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
        System.out.println("Equilibrium index is:"+ equil_point(arr));
        sc.close();
    }
}
