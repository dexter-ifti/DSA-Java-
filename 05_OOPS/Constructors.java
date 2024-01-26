public class Constructors {
    public static void main(String[] args) 
    {
      Student s1 = new Student();
      s1.name = "Taha" ;
      s1.roll = 123;
      s1.password = "aasdfdfe";

      s1.marks[0] = 80;
      s1.marks[1] = 100;
      s1.marks[2] = 20;

      for(int i : s1.marks)
      {
        System.out.print(i+" ");
      }

      Student s2 = new Student(s1);
      s2.password = "xyzacdd" ;
      s1.marks[2] = 50;
      for(int i : s2.marks)
      {
        System.out.print(i+" ");
      }


        
    }
}
class Student 
{
    String name;
    int age ;
    int roll_no;

    Student()               // this is non-parameterized Constructor 
    {       
        
    }
    Student(String name)    // this is parameterized 
    {
        this.name = name;
    }
    Student (int roll_no, int age)
    {
        this.roll_no = roll_no;
        this.age = age ;
    }
    /*  This is called Constructor overoading 
    as we created many constructor 
    and java will automatically choose the right constructor according to call
    if we remove the non-parameterized constructor as it's called automaticaly 
    but it will not work because it worked only when no other contructor are made
    if we want to call non-parameterized constructor automatically we have to delete all other constructors 
    */
}
class Student 
{
    String name;
    int roll;
    String password;
    int marks[];

    Student()               // this is non-parameterized Constructor 
    {  
        marks = new int[3];     
        System.out.println("Constructor is called.....");
    }
    // Shallow copy contructor      
    Student(Student s1)
    {
        marks = new int[3];
        this.name = s1.name ;
        this.roll = s1.roll ;
        this.marks = s1.marks;
    }

    // Deep Copy Constructor
    // Student (Student s1)
    // {
    //   marks = new int[3];
    //   this.name = s1.name ;
    //   this.roll = s1.roll ;
    //   for (int i = 0; i < marks.length; i++) {
    //     this.marks[i] = s1.marks[i];
    //   }
    // }
    Student(String name)
    {
        marks = new int[3];
        this.name = name;
    }
    Student(int roll)
    {
        this.roll = roll ;
    }
    
}
