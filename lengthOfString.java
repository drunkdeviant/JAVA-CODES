import java.util.Scanner;

public class lengthOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        int count=0;
        for(char c:s.toCharArray()){
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
