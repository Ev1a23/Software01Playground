package AB2022;

public interface IDecideable {
    public int decide(char a, char b);
    default int foo2()
    {
        return 3;
    }

    public static int t()
    {
        return 3;
    }

    public abstract int tr();



}
