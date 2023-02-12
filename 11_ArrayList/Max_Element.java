public class Max_Element
{
  public static void main(String args[])
  {
    ArrayList <Integer> list = new Arraylist<>();
     list.add(1);
     list.add(2);
     list.add(6);
     list.add(9);
     list.add(4);
     int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);
  }
} 
