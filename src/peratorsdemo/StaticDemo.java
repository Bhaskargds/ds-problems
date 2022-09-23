
class Emp
{
    int eid;
    int salary;
    static String ceo;
    public void show() //method
    {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}
public class StaticDemo
{
    public static void main(String[] args)
    {

        Emp bhaskar= new Emp();
        bhaskar.eid=8;
        bhaskar.salary=500000;
        Emp.ceo="mourya";

        Emp deepu= new Emp();
        deepu.eid=9;
        deepu.salary=400000;
        Emp.ceo="mourya";

        Emp.ceo="manjith";

        bhaskar.show();
        deepu.show();



    }
}
