import java.util.*;
public class InversionPair {
    public static int InversionCount(int[]arr,int n){
        int cnt=0;
        if(n<2 || n==0){
            return 0;
        }
        for(int j=0;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(arr[j]>arr[k]){
                    cnt++;
                }
            }
        }return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemnts");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.err.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("number of inversion pair:"+InversionCount(arr, n));
        sc.close();
    }
}
