package AB2021;

import java.io.EOFException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        System.out.println(func());
    }
    public static int func() {
        int sum = 0;
        try {
            List<Integer> ints = Arrays.asList(1,2,3);
            for (int i : ints){
                try {
                    if (i == 2) {
                        throw new EOFException();
                    }
                    if (i == 1) {
                        throw new Exception();
                    }
                    sum += 1;
                }
                catch(EOFException exp) {
                    sum += 2;
                    throw new Exception();
                }
                catch(Exception exp) {
                    sum += 3;
                }
            }
            return sum;
        }
        catch (Exception exp) {
            return sum += 7;
        }
    }
}