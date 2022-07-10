import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;

public class Playground {
    public static void setToFive(int arg)
    {
        arg = 5;
    }
    public static void main(String[] args)
    { /*
        int[] grades = {70,60,100,50};
        for (int g: grades)
        {
            System.out.println(g);
            switch (g)
            {
                case 100:
                    System.out.println("A+");
                    //break;
                case 90:
                    System.out.println("A");
                    //break;
                case 80:
                    System.out.println("B");
                    //break;
                case 70:
                    System.out.println("C");
                    //break;
                case 60:
                    System.out.println("D");
                    //break;
                default:
                    System.out.println("F");
            }
        }
      */

      /*  int cnt = 0;
        do {
            System.out.println(cnt);
            cnt--;
        }
        while (cnt<5);*/

/*     int x = 0;
     System.out.println(x);
     setToFive(x);
     System.out.println(x);*/

    /*Stream<Integer> s= Stream.generate(new NaturalNumbers());
    s.filter(x->x%7 ==0).filter(x->x<70).filter(x->x%10 == 0).forEach(System.out:: println);*/

        /*int i = 0;
        System.out.println(i++);
        i = 0;
        System.out.println(++i);*/

        //can add objects, can't get them
        List<?super Number> lst1 = new ArrayList<>();
        Number n = 3;
        lst1.add(n);
        /*Number n1 = lst1.get(0);*/

        //can't add objects
        List<?extends Number> lst2 = new ArrayList<>();
        /*lst2.add(2);*/
    }


}
