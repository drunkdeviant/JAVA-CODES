public class Sqaure {
    public static void findCoord(String s){
        int x1=Integer.parseInt(String.valueOf(s.charAt(0)));
        int y1=Integer.parseInt(String.valueOf(s.charAt(1)));
        int x2=Integer.parseInt(String.valueOf(s.charAt(2)));
        int y2=Integer.parseInt(String.valueOf(s.charAt(3)));

        //if gugu both coordinate same means they are one single point no way we can find the square ok
        if(x1==x2 && y1==y2){
            System.out.println("-1");
            return;
        }
        //if only x coordinate same means vertical line then we can find the y distance and add in x ok
        else if(x1==x2){
            int side=Math.abs(y2-y1);
            System.out.println((x1+side) +" " + y1 + " " + (x2+side) + " " + y2);
            return;
        }
        //if only y coordinate same means horizontal line then we can find the x distance and add in y ok
        else if(y1==y2){
            int side=Math.abs(x2-x1);
            System.out.println(x1 + " " + (y1+side) + " " + x2 + " " + (y2+side));
            return;        
        }
        //if diagonal points then very easy to find a kite shaped square
        else if(Math.abs(x2-x1)==Math.abs(y2-y1)){
            System.out.println(x1 + " " + y2 + " " + x2 +" " + y1);
            return;
        }
        else{
            System.out.println("-1");
            return;
        }
    }
    public static void main(String[] args) {
        findCoord("0012");
    }
}
