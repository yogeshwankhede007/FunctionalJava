package co.functiona_interfaces;

/**
 * @author Mr.Yog
 * This is a functional interface and allowed to have only one abstract method which is GreetingMsg
 */
@FunctionalInterface
public interface GreetingMsg {

    public void greet(String name);
}
