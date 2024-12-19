package matrix;
import java.util.*;
public class searchSortedMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        search(mat,33);
    }

     /*
      * Algorithm for searching in a sorted matrix
      cellvalue(0,m-1)
       key < cellvalue   
          move left
       key > cellvalue
          move bottom
      */

      /*
      * Algorithm for searching in a sorted matrix
      cellvalue(n-1,0)
       key < cellvalue   
          move  top
       key > cellvalue
          move right
      */

    public static void search(int mat[][],int key)
    {
        int n=mat.length;
        int m=mat[0].length;
        int si=0,sj=m-1;
        while(true){
            if(key<mat[si][sj]){
                sj--;
                if(sj<0)
                {
                    System.out.println("Key not found");
                    break;
                }
            }
            if(key>mat[si][sj]){
                si++;
                if(si>=n){
                    System.out.println("Key not found");
                    break;
                }
            }
            if(key==mat[si][sj]){
                System.out.println("Key found at index's"+si+" "+sj);
                break;
            }
        }
    }
}
