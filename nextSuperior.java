import java.util.Scanner;
import java.util.Stack;

public class nextSuperior {
    public static int[] findNextGreater(int[] arr){
        int []res=new int[arr.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;

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
        int[] result=findNextGreater(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
}
