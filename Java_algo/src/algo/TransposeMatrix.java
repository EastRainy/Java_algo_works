package algo;

public class TransposeMatrix {
    
    public int[][] transpose(int[][] matrix) {
    
        int[][] tMatrix = new int[matrix[0].length][matrix.length];

        for(int i=0; i<tMatrix.length;i++){
            for(int j=0; j<tMatrix[0].length; j++){
                tMatrix[i][j] = matrix[j][i];
            }
        }
   
        return tMatrix;
    }

}
