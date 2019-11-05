package quoters;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */

//@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
