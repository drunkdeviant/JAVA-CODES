import java.util.HashMap;
import java.util.Map;

public class MostRepetitive {
    public static char GetMostRepetitive(String s){
        HashMap<Character,Integer> mp=new HashMap<>();
        //Putting the characters as well as their corresponding counts
        for(int i=0;i<s.length();i++){
            int value=mp.getOrDefault(s.charAt(i),0);
            mp.put(s.charAt(i),value+1);
        }
        //Finding which is most occuring
        char MostRepetitive_char=' ';
        int max_count=0;
        for(Map.Entry<Character,Integer>it:mp.entrySet()){
            if(it.getValue()>max_count){
                max_count=it.getValue();
                MostRepetitive_char=it.getKey();
            }
        }
        return MostRepetitive_char;
    }
    
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(GetMostRepetitive(s));
    }
}
