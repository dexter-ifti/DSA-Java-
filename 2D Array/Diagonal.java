public class Diagonal {
    public static int diagonalSum(int mat[][]) {
        // BRUTE FORCE --------->O(n^2)
        // int sum = 0 ;
        // for(int i = 0 ; i < mat.length ; i++){
        //     for(int j = 0 ; j < mat[0].length ; j++){
        //         if(i == j){
        //             sum += mat[i][j] ;
        //         }else if((i + j) == mat.length-1){
        //             sum += mat[i][j] ;
        //         }
        //     }
        // }
        // return sum ;

        // OPTIMIZED APPROACH ----->O(n)
        int sum = 0 ;
        for(int i = 0 ; i < mat.length ; i++){
        //    Primary Diagonal
            sum += mat[i][i] ;
            // Secondary Diagonal
            if(i != mat.length-1-i){
                sum += mat[i][mat.length-1-i];
            }
        }
        return sum;
    }    
    public static void main(String[] args) {
        int mat[][] = { {0,1,2},
                        {3,4,5},
                        {6,7,8}} ;

        System.out.println(diagonalSum(mat));
    }
}
