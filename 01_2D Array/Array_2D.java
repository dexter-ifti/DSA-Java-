import java.util.Scanner;

public class Array_2D {

    public static boolean search(int mat[][], int key) {
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
               if(mat[i][j] == key){
                System.out.println("key found at ("+ i + "," + j + ")");
                return true ;
               }
            }
        }
        System.out.println("Not Found");
        return false;
    }

    public static int getLargest_Smallest(int mat[][]) {
        int largest = Integer.MIN_VALUE ;
        int smallest = Integer.MAX_VALUE ;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] > largest){
                    largest = mat[i][j] ;
                }
                if(mat[i][j] < smallest){
                    smallest = mat[i][j];
                }
            }
        }
        System.out.println("Smallest element is "+smallest);
        return largest ;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int mat[][] = new int[3][3];
            // INPUT
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            // OUTPUT
            for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
            System.out.println("Enter Elemeents ");
            System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
            }
            // search(mat, 6);
            System.out.println(getLargest_Smallest(mat));
        }

    }
}
