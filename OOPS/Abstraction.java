public class Abstraction
{
   public static void main(String[] args) 
   {
    // Horse h = new Horse();
    // h.eat();
    // h.walk();
    // System.out.println(h.color);
    // Chiken c = new Chiken();
    // c.eat();
    // c.walk();
    Mushtang myHorse = new Mushtang();
    // Animal --> Horse -- > Mushtang 
   }
}
abstract class Animal
{
  String color;
  Animal()
  {
    // color = "Brown";
    System.out.println("Animal constructor is called ...");
  }
  void eat()
  {
    System.out.println("eats");
  }
  abstract void walk();
}
class Horse extends Animal
{
  Horse()
  {
    System.out.println("Horse Constructor is Called.....");
  }
  void changeColor()
  {
    color = "Brown" ;
  }
  void walk()
  {
    System.out.println("walks on four legs");
  }
}
class Mushtang extends Horse
{
  Mushtang()
  {
    System.out.println("Mushtang Contructor is called .....");
  }
}
class Chiken extends Animal
{
  void changeColor()
  {
    color = "Yellow" ;
  }
  void walk()
  {
    System.out.println("walks on 2 legs");
  }
}
