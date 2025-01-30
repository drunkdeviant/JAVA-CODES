import java.util.Scanner;
public class LastMatch {
    static boolean isSpecialProperty(int N){
        boolean flag=false;
        int sqr=N*N;
        int cnt=0;
        while(sqr>0){
            int digit=sqr%10;
            sqr=sqr/10;
            if(digit==N){

            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to check");
        int input=sc.nextInt();
        if(isSpecialProperty(input)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
