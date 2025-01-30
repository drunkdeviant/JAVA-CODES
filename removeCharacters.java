import java.util.Scanner;

public class removeCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        //or simply String res=""; and then in for loop res+=s.charAt(i)
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int ascii=(int)c;

            if(ascii>=65 && ascii<=90){
                sb.append(c);
            }
            else if(ascii>=97 && ascii<=122){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
