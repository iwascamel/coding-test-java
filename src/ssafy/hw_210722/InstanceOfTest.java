package ssafy.hw_210722;

class One
{
    void m1()
    {
        System.out.println("m1 method in class One");
    }
}
class Two extends One
{
    void m1()
    {
        System.out.println("m1 method in class Two");
    }
}
public class InstanceOfTest
{
    public static void main(String[] args)
    {
        One o = new Two();
        o.m1();
        Two t = (Two)o;
    }
}