package shinesoft;

//class ThisKeyword
//{
//    int id;//instances
//    String name;
//    
//    void methSet(int id,String name)//locals
//    {
//        this.id = id;
//        this.name = name;
//        this.methGet();
//    }
//    void methGet()
//    {
//        System.out.println(id);
//        System.out.println(name);
//    }
//    
//}
//public class MyClass 
//{
//    public static void main(String args[]) 
//    {
//        ThisKeyword tk = new ThisKeyword();
//        tk.methSet(101,"Jake");
//       
//    }
//}
//1. A constructor call using this can be made from only inside 
    //  a constructor
    //2. A constructor call using this can be made from only the 
    //  first line

//class ConsThis
//{
//    ConsThis()
//    {
//       System.out.println("Hello This is a constructor");
//    }
//    ConsThis(String st)
//    {
//       this();//default constructor call
//       System.out.println("Hello This is a Parametriezed constructor");
//       System.out.println(st);
//       //this();
//       //call to this must be first statement in constructor
//    }
//    ConsThis(String st,int s)
//    {
//       this("Hello");//default constructor call
//       
//       System.out.println(st + s);
//       //this();
//       //call to this must be first statement in constructor
//    }
//    
//    
//    
//}
//public class MyClass 
//{
//    public static void main(String args[]) 
//    {
//        ConsThis ct = new ConsThis("Am a parameter", 25);
//    }
//}


class Employee
{
    int eid = 101;
    String ename = "Robert";
    Employee()
    {
       System.out.println("Am an Employee Def. Const");
    }
    Employee(int sal)
    {
       System.out.println(sal);
    }
    void meth()
    {
        System.out.println("some method");
    }
}
class Manager extends Employee
{
    int eid = 456;
    String ename = "Yihun";
    Manager()
    {
       //super();//by default it is available
       //making a call to super class def. constructor
       System.out.println("Am an Manager Def. Const");
       System.out.println(eid+":"+ename);
       System.out.println(super.eid+":"+super.ename);
       super.meth();
    }
    Manager(int sal)
    {
       //super();//by default it is available
       //we can override using below code
       super(sal+25000);
       System.out.println(sal);
    }
}
public class MyClass 
{
    public static void main(String args[]) 
    {
        Manager m = new Manager();
        //Manager m1 = new Manager(15000);
        
    }
}

