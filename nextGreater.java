import java.util.*;
public class nextGreater {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of elements should be:");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Input for arrays");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int[] result=nextGreatest(array);
        for(int i=0;i<n;i++){
            System.out.print(result[i]);

        }
        sc.close();
    }
    public static int[] nextGreatest(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<arr.length;i++){
          temp[i]=-1;
          for(int j=i+1;j<arr.length;j++){
            if(arr[j]>arr[i]){
                temp[i]=arr[j];
                break;
            }
          }
        }
        return temp;
    }
}
