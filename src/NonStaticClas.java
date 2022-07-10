

public class NonStaticClas {
    public static int func()
    {
        return 3;
    }
    public static class innerClass extends NonStaticClas{

        public static int func()
        {
            return 5;
        }


    }

    public static void main(String[] args) {
        NonStaticClas c = new NonStaticClas();
        innerClass tmp = new innerClass();
        System.out.println(c.func());
        System.out.println(tmp.func());
    }
}

