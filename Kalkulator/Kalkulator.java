import static java.lang.Math.sqrt;

public class Kalkulator
{
    public static int add (int x, int y){
        return x+y;
    }

    public static int subtraction (int x, int y){
        return x-y;
    }

    public static int multiplication (int x, int y){
        return x*y;
    }

    public static double division (double x, double y){
        return x/y;
    }

    public static int poleKwadratu (int x){
        return x*x;
    }

    public static double root (int x){
        return sqrt(x);
    }

    public static int areaOfTriangle( int x, int y){
        return (x*y)/2;
    }
}
