class ThisKeyword
{
    int id;//instances
    String name;

    void methSet(int id,String name)//locals
    {
        this.id = id;
        this.name = name;
        this.methGet();
    }
    void methGet()
    {
        System.out.println(id);
        System.out.println(name);
    }

}
public class MyThisClass
{
    public static void main(String args[])
    {
        ThisKeyword tk = new ThisKeyword();
        tk.methSet(101,"Jake");

    }
}

