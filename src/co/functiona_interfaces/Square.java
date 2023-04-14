package co.functiona_interfaces;

/**
 * @author Mr.Yog
 * This is an example of functional interface with annotation
 * A java program to demonstarace lambda expressions to implement a user defined functional interface
 */
@FunctionalInterface
public interface Square {

    int calculate(int x);
}
class Test2{
    public static void main(String[] args) {
        int a =5;

        //lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        //param passed & return type must be same as defined in prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}
