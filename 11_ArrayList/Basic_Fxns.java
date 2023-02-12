public class Basic_fxns 
{
  public static void main (String args[])
  {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list1 = new ArrayList<>();
        ArrayList <Float> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.add(2, 10);
        System.out.println(list);

        System.out.println(list.get(2));

        list.remove(2);
        System.out.println(list);

        list.set(2, 10);
        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        System.out.println(list.size()); 
  }
}
