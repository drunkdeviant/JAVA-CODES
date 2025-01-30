import java.util.Scanner;
public class Edward {
    public static int max_cuts(int n){
        int max_cut=1+n*((n+1)/2);
        return max_cut;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cuts on the cake");
        int cut=sc.nextInt();
        System.out.println("Mximum number of cuts are:"+max_cuts(cut));
        sc.close();
    }
}
