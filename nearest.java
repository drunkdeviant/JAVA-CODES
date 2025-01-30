import java.util.*;
public class nearest {
    public static int nearestInt(int num,int m){
        int quotient=num/m;
        int lowNearest,highNearest;
        if(num%m==0){
            System.out.println("No nearest integer");
        }
        lowNearest=m*quotient;
        highNearest=m*(quotient+1);
        if(Math.abs(num-lowNearest)<Math.abs(num-highNearest))
            return lowNearest;
        else
            return highNearest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print the number to divide");
        int number=sc.nextInt();
        System.out.println("Print the m");
        int m=sc.nextInt();
        int result=nearestInt(number, m);
        System.out.println("Nearest number is:"+result);
        sc.close();
    }
}
