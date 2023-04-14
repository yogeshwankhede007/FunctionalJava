package co.functiona_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {

        //create a list of strings

        List<String> names = Arrays.asList(
                "appium", "selenium", "java", "application");
        //declare the predicate type as string and use lambda expressions to create object

        Predicate<String> p = (s) -> s.startsWith("app");

        //Iterate through the list
        for (String st : names) {
            //call the test method
            if (p.test(st)) {
                System.out.println(st);
            }

        }
    }
}

