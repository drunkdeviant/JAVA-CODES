import java.util.Scanner;
class test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            System.out.println("sum of two numbers is:"+c);
        }
        finally{
            sc.close();
        }
    }
}