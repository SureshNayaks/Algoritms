public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1,2},{3,4}};
        int[][] B = {{5,6},{7,8}};
        int [][] c = matrixMultiplication(A,B);
        for (int i=0;i< A.length;i++){
            for (int j=0;j<A[1].length;j++){
                System.out.println(c[i][j]);
            }
        }
    }

    private static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[1].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[1].length;j++){
                for (int k=0;k<a.length;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
}
