public class A extends B {
    public String foo(String s)
    {
        return s;
    }
    public static void main(String[] args)
    {
        A a = new A();
        B b = (B)a;
        /*b.foo("s");*/
    }
}
