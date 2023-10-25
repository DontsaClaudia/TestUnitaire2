package Controlers;

public class Calculatrice
 {
    public static int  add(Integer a, Integer b)
    {
        return (a+b);
    }

    public static int  moins(Integer a, Integer b)
    {
        return (a-b);
    }

    public static int  multi(Integer a, Integer b)
    {
        return (a*b);
    }

    public static int  div(Integer a, Integer b)
    {
        if(b!=0){
             return (a/b);
        }
        return 0;
    }
}

