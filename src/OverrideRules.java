public class OverrideRules {

    public void foo1()
    {
        System.out.println("1");
    }

    public Number foo2()
    {
        int i = 3;
        return i;
    }

    protected void foo3()
    {
        System.out.println("protected");
    }

    public final void foo4()
    {
        System.out.println("Can't override");
    }

    public static void foo5()
    {
        System.out.println("Static can't be overridden, only shadow will work");
    }

    public void foo6() throws Exception
    {
        System.out.println("drop or narrow exception");
    }

    public Number foo7()
    {
        return 3;
    }
}
