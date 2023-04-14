package co.functiona_interfaces;

public class Main {
    public static void main(String[] args) {

        GreetingMsg gm = new GreetingMsg() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Yogi");

        GreetingMsg gm2 = (name) -> {
            System.out.println(" Hello "+ name);
        };
        gm2.greet("MR. YOG");
    }
}
