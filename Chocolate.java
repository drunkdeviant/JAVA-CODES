import java.util.Scanner;
public class Chocolate {
    static int min_number(int[] arr){
        int max_chocolates=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i>max_chocolates)
                max_chocolates=i;
        }
        for(int i:arr){
            sum+=max_chocolates-i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of people");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the number of cakes to be distributed");
        for(int i:arr){
            arr[i]=sc.nextInt();
        }
        int res=min_number(arr);
        System.out.println("Minimum cake"+res);
        sc.close();
    }
}
