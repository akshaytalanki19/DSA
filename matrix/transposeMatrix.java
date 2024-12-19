package matrix;

public class transposeMatrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        printTranspose(a);
    }
    public static void printTranspose(int mat[][]){
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
