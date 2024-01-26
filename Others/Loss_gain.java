import java.util.* ;
public class Loss_gain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price ::: ");
        float cp = sc.nextFloat();
        System.out.println("enter selling price ::: ");
        float sp = sc.nextFloat();

        if(cp > sp){
            float loss = cp - sp ;
            System.out.println("Loss = "+ loss);
        }else{
            float profit = sp - cp ;
            System.out.println("Profit = " +profit);
        }
    }
}