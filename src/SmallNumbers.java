import java.util.function.Supplier;

public class SmallNumbers implements Supplier<Integer> {
    int currNum;
    public Integer get()
    {
        currNum++;
        if(currNum>=5)
        {
            currNum =0;
        }
        return  currNum;
    }
}
