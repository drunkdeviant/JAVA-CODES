import java.util.Scanner;

public class removeVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='a'&&c!='A'&&c!='e'&&c!='E'&&c!='i'&&c!='I'&&c!='o'&&c!='O'&&c!='u'&&c!='U'){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
