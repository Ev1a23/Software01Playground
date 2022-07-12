package BA2020;

import java.util.Comparator;

public class Q09 {
    public static void main(String[] args) {
        AA a = new BB();
        BB b = new BB();
        System.out.print(a.getComp("abc").compare(1, 1) + " ");
        System.out.print(b.getComp("abc").compare(1, 1) + " ");
    }
}
class AA{
    public Comparator<Integer> getComp(Object a) {
        return (x,y) -> Integer.compare(x, y);
    }
}
class BB extends AA{
    public Comparator<Integer> getComp(String a) {
        return (x,y)-> super.getComp(a).compare(2*x, y);
    }
    public Comparator<Integer> getComp(Object a) {
        return (x,y)-> super.getComp(a).compare(x, 3*y);
    }
}
