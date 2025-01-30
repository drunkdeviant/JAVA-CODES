public class rev {
    public static void main(String args[]){
        String s="Hello World";
        System.out.println(reverse(s));
    }
    public static String reverse(String str){
        String rev=" ";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }
}
