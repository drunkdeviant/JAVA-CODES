import java.util.Scanner;

public class maxUniqueExponent{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a new string");
        String s=sc.nextLine();
        System.out.println(pattern(s));
        sc.close();
    }
    public static String pattern(String s){
        int m=s.length();
        int cnt=1;
        String res="";
        for(int i=0;i<m;i++){
            if(i+1<m && s.charAt(i+1)==s.charAt(i)){
                cnt++;
            }
            else{
                res+=s.charAt(i);
                if(cnt>1){
                    res+=cnt;
                }
                cnt=1;
            }
        }
        return res;
    }
}