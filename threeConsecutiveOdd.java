class threeConsecutiveOdds {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0){
                // return true;
                count=+1;
                sum=sum+count;
            }
            else
                count=0;
                // return false;
        }
        if(sum==3){
            return true;
        }
        else
            return false;
    }
}
