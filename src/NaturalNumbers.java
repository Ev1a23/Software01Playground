import java.util.function.Supplier;

public class NaturalNumbers implements Supplier<Integer> {
    private int i;
    @Override
    public Integer get()
    {
        return ++i;
    }
}
