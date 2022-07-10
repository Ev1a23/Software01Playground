package AA2021;

public class HelloWorld {
    protected int w = 5;
/*public class A { //op1*/
public static class A { //op2
//public abstract class A { //op3
public int i = 0;

    public A(){
        this(1);
    }
    public A(int a){
        this(a,2*a);
        System.out.print(a);
    }
    public A(int a, int b){
        setI();
        System.out.print(a+b+i); //*
    }

    public void setI() {
        HelloWorld h = new HelloWorld();
        this.i = h.w; //*
    }
}
    public static void main(String[] args){
        A a = new A(); //*
    }
}
