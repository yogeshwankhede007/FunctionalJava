package co.functiona_interfaces;

/*
 * @author Mr.Yog
 * This is an example of functional interface
 */
public class Test {
    public static void main(String[] args) {

        //create random inner class object
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread Created");
            }
        }).start();
/*
 * Second approach by using lambda expressions
 * codeOptimization
 */
        //lambda expression to create the object
        new Thread(() ->{
            System.out.println("new thread created");
        }).start();
    }
}
