package matrix;

import java.util.Scanner;

public class diagnolSum {
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
        diagSum(matrix);
        sc.close();
    }
    public static void diagSum(int matrix[][])
    {
        int leftDiagnol=0;
        int rightDiagnol=0;
        int n=matrix.length;
       // int m=matrix[0].length;
        for(int i=0;i<n;i++){
            leftDiagnol+=matrix[i][i];
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(i+j==n-1)
        //         rightDiagnol+=matrix[i][j];
        //     }
        // }
        for(int i=0;i<n;i++)
        {
            rightDiagnol+=matrix[i][n-i-1];
        }
        System.out.println(leftDiagnol+ " "+ rightDiagnol);
    }
}
