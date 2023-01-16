public class Advanced_Patterns {
    public static void main(String[] args) {
        invted_Half_Pyamid(5);
    }
    public static void hollow_Rectangle(int totRows , int totCols) {
        for(int i = 1 ; i <= totRows ; i++){
            for(int j = 1 ; j <= totCols ; j++){

                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        
    }
    public static void inverted_Rotated_half_Pyramid(int n) {
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n - i; j++ ){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invted_Half_Pyamid(int n) {
        for(int i = 1 ; i <= n ; i++){
            
            for(int j = 1 ; j <= n - i + 1 ; j++){
                
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
