import java.util.*;
public class sameEle {
    public static List<Integer> SameEle(int a[],int b[]){
        List<Integer> same=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j] && !same.contains(a[i])){
                   same.add(a[i]);
                }
            }
        }
        return same;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemnts for first array");
        int n=sc.nextInt();
        int[]frst=new int[n];
        System.err.println("Enter the elements");
        for(int i=0;i<n;i++){
            frst[i]=sc.nextInt();
        }
        System.out.println("Enter the number of elemnts for second array");
        int m=sc.nextInt();
        int[]scnd=new int[m];
        System.err.println("Enter the elements");
        for(int i=0;i<n;i++){
            scnd[i]=sc.nextInt();
        }
        System.out.println("Same elements are:"+SameEle(frst, scnd));
        sc.close();
    }
}
