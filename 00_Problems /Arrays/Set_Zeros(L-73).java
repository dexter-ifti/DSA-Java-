// Brute Force - O((N*M)*(N + M)) + O(N*M) 
// THIS IS NOT WORKING FOR MATRIX CONTAINING NEGATIVE NUMBERS
class Solution {
    public void setZeroes(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public void markRow(int matrix[][], int i){
        int m = matrix[0].length;
        for(int j = 0; j < m; j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }       
    }
    public void markCol(int matrix[][], int j){
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }

}
// BETTER APPROACH
// Time - O(2*(N*M))
// Space - O(N) + O(M)
class Solution {
    public void setZeroes(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;

    int row[] = new int[n];
    int col[] = new int[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
// OPTIMIZED - O(m*n) but Space O(1)
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int x = 1, y = 1;

        for(int j = 0; j < n; j++){
            if(matrix[0][j] == 0){
                x = 0;
            }
        }
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0){
                y = 0;
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int j = 1; j < n; j++){
            if(matrix[0][j] == 0){
                for(int i = 0; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < m; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j < n; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(y == 0){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
        if(x == 0){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
    }
}
