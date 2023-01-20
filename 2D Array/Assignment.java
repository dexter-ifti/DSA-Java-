public class Array_2D_Assignment {
    // Ques - 1 --> Print the Number of 7's that are in the 2D Array
    public static int countSevens(int matrix[][]) {
        int sum = 0 ; 
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 7){
                    sum++ ;
                }
            }
        }
        return sum ;
    }

    // Ques - 2 ---> Print out the Sum of the numbers in the second row of the matrix
    public static int sumRow(int matrix[][]) {
        int sum = 0 ;
        for(int i = 0 ; i < matrix[1].length ; i++){
            sum += matrix[1][i];
        }
        return sum ;
    }

    // Ques - 3 ---> Find Transpose of a Matrix

    public static void printMatrix(int matrix[][]){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
            System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int matrix[][] = {{4,7,8},{8,8,7}};
        // System.out.println(countSevens(matrix));
        int matrix[][] = {{1,4,9},
                          {11,4,3},
                          {2,2,3}};
        // System.out.println(sumRow(matrix));
       
        System.out.println("given matrix is :");
        printMatrix(matrix);

        int row = 3 , column = 3 ;
        int transpose[][] = new int[column][row] ;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of matrix is :");
        printMatrix(transpose);
    }
}
