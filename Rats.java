import java.util.Scanner;

public class Rats {
    public static int totalHouses(int arr[],int r,int unit){
        int foodRequired=r*unit;
        int sum=0;
        if(arr.length==0)return -1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>=foodRequired){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of elements should be:");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("Food input for arrays");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Number of rats is:");
        int r=sc.nextInt();
        System.out.println("Amount of food consumed by rats:");
        int unit=sc.nextInt();
        System.out.println("Number of Houses"+totalHouses(array, r, unit));
        sc.close();
    }
}
