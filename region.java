import java.util.Scanner;
public class region {
    public static int max_regions(int N){
        return 1 + (N*(N+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int input=sc.nextInt();
        System.out.println("Max regions formed are:"+max_regions(input));
        sc.close();
    }
}
