public class Interfaces 
{
   public static void main(String[] args) 
   {
    // Queen q = new Queen();
    // q.moves();
    Bear b = new Bear();
    b.eatMeat();
    b.eatVeg();
   }
}
interface chessPlayer
{
  void moves();
}
class Queen implements chessPlayer
{
  public void moves()
  {
    System.out.println("up, down, left, right, diagonal(in all dir)");
  }
}
class Rook implements chessPlayer
{
  public void moves()
  {
    System.out.println("up, down, right, left");
  }
}
interface Carnivore
{
  void eatMeat();
}
interface Herbivore
{
  void eatVeg();
}
class Bear implements Carnivore, Herbivore
{
  public void eatMeat()
  {
    System.out.println("Eats Meat");
  }
  public void eatVeg()
  {
    System.out.println("Eats grass vagerah");
  }
}
