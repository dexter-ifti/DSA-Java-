public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // p1.setTip(6);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());
        // p1.setColor("Red");
        // p1.setTip(7);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());

        // BankAccount myAccount = new BankAccount();
        // myAccount.username = "Taha";
        // // myAccount.password = 1245654; this cant be accessed ; we only can set the password
        // myAccount.setPassword(1243654);
        // System.out.println(myAccount.username);

        Student s1 = new Student();
        Student s2 = new Student("Taha");
        Student s3 = new Student(123, 18);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.age);
    }
}

class Pen {
   private String color;
   private int tip;

   String getColor(){
    return this.color;
   }

   int getTip(){
    return this.tip;
   }

    void setColor(String Newcolor){
        color = Newcolor ;
    }
    void setTip(int NewTip){
        tip = NewTip ;
    }
    
}

class BankAccount {
    public String username;
    // private int password;

    void setPassword(int pwd){
        // password = pwd;
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
