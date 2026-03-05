package arrays.arrayProblems;

public class parseMatrix {
    public static void main(String[] args) {
        int[][] matrix= {
                {0, 0, 3},
                {0, 0, 0,},
                {4, 0, 0}
        };
        int rows=matrix.length;
        int cols=matrix[0].length;//only do it for a square matrix
        int zeroCount=0;
        int nonZeroCount=0;
        //Traverse the amtrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    zeroCount++;
                }else{
                    nonZeroCount++;
                }
            }

        }
        System.out.println("Zeros: " + zeroCount);
        System.out.println("Non zeros: " + nonZeroCount);
        System.out.println(zeroCount > nonZeroCount ? "Sparse" : "Not Sparse");
    }
}
