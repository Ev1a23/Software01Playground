package AA2021;

import java.util.Arrays;
import java.util.List;

public class ExceptionsTest {
    public static Object func(int i) throws Exception{
        if (i %2 == 0){
            throw new Exception();
        }
        if (i %3 == 0){
            throw new NullPointerException();
        }
        if (i %5 == 0){
            return new Exception();
        }
        return 2;
    }
    public static void main(String[] args){
        int sum = 0;
        List<Integer> lst = Arrays.asList(1,2,3,5);
        try{
            for (int num : lst){
                try{
                    func(num);
                    sum+=1;
                }
                catch(Exception exp){
                    sum += 1;
                }
            }
        }
        finally{
            sum += 1;
        }
        System.out.println(sum);
    }
}
