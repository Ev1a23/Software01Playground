package AA2021;

public class Grandma {
    public int i;
    public Grandma(int i){this.i = i;}

    public void p(String s)
    {
        System.out.println(s);
    }

    public class Mom{
        private Grandma g;
        public Mom(int i)
        {
            this.g = new Grandma(i);
            g.p("hey");
        }


    }
}
