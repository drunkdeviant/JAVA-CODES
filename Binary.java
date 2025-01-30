import java.util.Scanner;

public class Binary {
    public static int OperationsBinaryString(String str){
        if(str==null || str.length()<2){
            return -1;
        }
        int res=str.charAt(0)-'0';
        for(int i=1;i<str.length();i+=2){
            char prev=str.charAt(i);
            int nextBit=str.charAt(i+1)-'0';
            if(prev=='A'){
                res=res & nextBit;
            }
            else if(prev=='B'){
                res=res | nextBit;
            }
            else{
                res=res ^ nextBit;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the binary string");
        String s=sc.nextLine();
        System.out.println("Final result is:"+OperationsBinaryString(s));
        sc.close();
    }
}
