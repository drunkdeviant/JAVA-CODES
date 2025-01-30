public class replaceChar {
    public static String replacechar(String str,char c1,char c2){
        String result=str.replace(c1, c2);
        return result;
    }
    public static void main(String args[]){
        String s="apple";
        String res=replacechar(s, 'a','p');
        System.out.println("NEW updated String:"+res);
    }
}
