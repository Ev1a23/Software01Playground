package BB2019;

public class A {
    public String str = "A";
    public boolean bool = false;

    public void foo()
    {
        try{moo();}
        catch (Exception exp){}
    }

    public void flipBool(){bool = !bool;}
    public void moo() throws Exception{
        System.out.println("A.moo " + bool+" ");
    }

    public static void doo(A a){a.foo();}

}
