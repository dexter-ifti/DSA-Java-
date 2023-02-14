import java.util.ArrayList;

public class Monotonic {
    public static boolean isMonotonic(ArrayList<Integer>list) {
        boolean inc = true; 
        boolean dec = true ;

        for(int i = 0 ; i < list.size()-1 ; i++){
            if(list.get(i) > list.get(i+1)){
                inc = false ;
                break;
            }
        }
        
        for (int i = 0; i < list.size()-1 ; i++) {
            if(list.get(i) < list.get(i+1)){
                dec = false ;
                break;
            }
        return inc || dec ;
        
    }
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(6);

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(6);
        list1.add(8);
        list1.add(2);

        System.out.println(isMonotonic(list)); 
        System.out.println(isMonotonic(list1));  
    }
}
