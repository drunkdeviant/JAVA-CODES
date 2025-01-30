import java.util.Scanner;
public class frequency {
    public static int count_freq(String str,String target){
        int index=str.indexOf(target);
        int cnt=0;
        while (index!=-1){
            cnt++;
            index=str.indexOf(target,index+target.length());
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String s2="is";
        System.out.println("Number of times 'is' appears is "+count_freq(s,s2));
        sc.close();
    }
}
