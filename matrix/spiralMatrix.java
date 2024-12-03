package matrix;

import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        Matrix.printMatrix(matrix);
        spirlPrint(matrix);
        sc.close();
    }
    public static void spirlPrint(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int startRow=0;
        int endRow=n-1;
        int startCol=0;
        int endCol=m-1;
        while(startRow <= endRow && startCol <=endCol)
        {
            // top row
            for(int j=startCol; j<=endCol ;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
             startRow++;
            //right
            for(int i=startRow;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            endCol--;
            //bottom
            for(int j=endCol;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            endRow--;
            //left
            for(int i=endRow;i>=startRow;i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
        }
    }
}
