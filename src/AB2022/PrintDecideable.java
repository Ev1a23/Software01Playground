package AB2022;

public class PrintDecideable {
    public static void printDecision(IDecideable item)
    {
        System.out.println(item.decide('x','y'));
    }
    public static void main(String[] args)
    {
        /*printDecision((a,b)->"abc"+a);*/
        /*printDecision((a,b)->new DecideClass());*/
        /*printDecision((a,b)-> DecideClass.i++);*/
    }
}
