import java.util.*;
public class Superior {
    public static int FindNumberOfSuperiorElements(int[] arr,int n){
        int largest=-1;
        int cnt=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>largest){
                largest=arr[i];
                cnt++;
            }
        }
        return cnt;
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
        System.out.println(FindNumberOfSuperiorElements(an,n));
        sc.close();
    }
}

