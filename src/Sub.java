import java.io.IOException;

public class Sub extends OverrideRules{
    //this is not an override just a new method because parameters are different
    public void foo1(int i)
    {
        System.out.println("new 1");
    }

    public Integer foo2()
    {
        return 3;
    }
    //visibility is same or more visible than overridden method
    public void foo3()
    {
        System.out.println("public");
    }

    //won't work, can't override final. As well, can't extend final class
    /*public final void foo4()
    {

    }*/

    //Won't work, can't override static method. But, next option will work(shadowing)
    /*public void foo5()
    {

    }*/
    public static void foo5()
    {
        System.out.println("Shadowed");
    }

    public void foo6() throws IOException
    {
        System.out.println("narrowed");
    }
    //also will work
    /*public void foo6()
    {
        System.out.println("dropped");
    }*/
    //is subtype of parent
    public Integer foo7()
    {
        return 3;
    }




}
