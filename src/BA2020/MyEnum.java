package BA2020;

public class MyEnum{
    public static final MyEnum CLAUDE = new MyEnum("claude");
    public static final MyEnum AUGUSTE = new MyEnum("Auguste");
    public static final MyEnum EDGAR = new MyEnum("Edgar");
    String name;
    private MyEnum(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
