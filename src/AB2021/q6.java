package AB2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q6 {
    public static void main(String[] args)
    {
        List<Integer> lst = new ArrayList<>();
        lst = Arrays.asList(2,5,6,1);
        lst.sort((x,y)->-Integer.compare(x,y));
        System.out.println(lst);


    }
}
