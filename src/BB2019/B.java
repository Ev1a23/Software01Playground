package BB2019;

import java.util.HashSet;
import java.util.Set;

public class B extends A{
    protected String str = "B";

    public void moo() {
        System.out.println("B.moo " + bool + " ");
    }

    public void foo()
    {
        flipBool();
        super.foo();
    }

    public static void doo(A a)
    {
        a.flipBool();
        a.doo(a);
    }
    public static void main(String[] args)
    {
        A a = new B();
        B b = new B();
        a.doo(a);
        b.doo(b);
        Set<Integer> s = new HashSet<>();
        s.add(null);
        System.out.println(s.size());
    }
}
