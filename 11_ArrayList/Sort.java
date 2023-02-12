public class Sort
{
  public static void main(String args[])
  {
    ArrayList <Integer> list = new ArrayList<>();
            list.add(1);
            list.add(9);
            list.add(7);
            list.add(2);
            list.add(6);
            // swap(list);
            System.out.println(list);
            Collections.sort(list);
            System.out.println(list);
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);
  }
}  
