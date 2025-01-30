import java.util.Scanner;

public class celebrity {
    public static int Is_Celebrity(int[][] m,int r,int c){
        int cnt=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]==1){
                    cnt++;
                }
                else{
                    cnt--;
                }
            }
            if(cnt>1){
                System.out.println("Celebrity is present");
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter rows");
       int r=sc.nextInt();
       System.out.println("Enter columns");
       int c=sc.nextInt();
       int m[][]=new int[r][c];
       System.out.println("Enter the elements");
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            m[i][j]=sc.nextInt();
        }
       }
       System.out.println(Is_Celebrity(m, r, c));
       sc.close();
    }
}
