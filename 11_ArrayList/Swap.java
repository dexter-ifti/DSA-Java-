public class Swap
{
  public static void main(String args[])
  {
    ArrayList <Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            swap(list);
            System.out.println(list);
  }
  public static void swap(ArrayList <Integer> list) {
        int temp = list.get(2);
        list.set(2, list.get(0));
        list.set(0, temp);
    }
}   
