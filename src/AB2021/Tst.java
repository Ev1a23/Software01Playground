package AB2021;

public class Tst {
    public static void main(String [] args)
    {
        Outer o1 = new Outer();
        Outer.Inner i1 = o1.new Inner();
        Outer o2 = new Outer();
        System.out.println(i1.getNum(o2));
    }
}
