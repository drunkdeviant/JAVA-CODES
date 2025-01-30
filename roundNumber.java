public class roundNumber {
    public static boolean isRound(int input){
        if(input<0){
            return false;
        }
        else{
            int sum=0;
            while(input!=0){
                int digit=input%10;
                sum+=Math.pow(digit,2);
                input/=10;
                isRound(sum);
                if(sum==1){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
}
