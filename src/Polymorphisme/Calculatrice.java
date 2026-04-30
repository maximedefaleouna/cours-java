package Polymorphisme;

public class Calculatrice {


    // polymorphisme statique par surchage

    protected String type ;
    public Calculatrice( String type) {
        this.type = type ;
    }

    // Addition de deux entiers
    public void additionner(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a+b));


    }

    // Addition de trois entiers
    public void additionner(int a, int b, int c) {
        System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));


    }

    // Addition de deux doubles
    public double additionner(double a, double b) {
        return a + b;
    }



}
