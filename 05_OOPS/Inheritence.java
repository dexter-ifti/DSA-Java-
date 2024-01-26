public class OOPS 
{
   public static void main(String[] args) 
   {
    Dog dobby = new Dog();
    dobby.eat();
    dobby.legs = 4;
    System.out.println(dobby.legs);
   }
}
// Base/Parent Class
class Animal
{
  String color;

  void eat()
  {
    System.out.println("eats");
  }
  void breath()
  {
    System.out.println("Breaths");
  }
}
// Derived/Child Class
class Mammal extends Animal 
{
  int legs;
}
// Derived/Child Class   
class Dog extends Mammal // ---> This is Multi Level Inheritence
{
  String breed;
}



// Derived/Child Class
// class Fish extends Animal  // --> this is single level inheritence
// {
//   int fins;

//   void swim()
//   {
//     System.out.println("Swims");
//   }
// }


// Hierarchial Inheritence --> more derived calsses from one Base Class Base--> derived1 & derived2...
// Hybrid Inheritence --> Base -> derived1 & derived2... 
// derived1 -> derived class ....
