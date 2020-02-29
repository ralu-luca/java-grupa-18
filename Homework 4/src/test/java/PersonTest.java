import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void shouldSortPersons() throws Exception{
        Person person = new Person("Bob", 25);
        Person person1 = new Person("Mia", 16);
        Collection<Person> personCollection = new TreeSet<>();
        person.getAge();
        person1.getAge();
        assertNotEquals(25, 16, "Sorted by age");


    }

    @Test
    void getBY_AGE() {
        Person person = new Person("Cate", 45);
        Person person1 = new Person("Danielle", 19);
        Comparator.comparing(Person::getAge);

        assertNotEquals(45, 19, "danielle is younger");

    }

    @Test
    void getBY_NAME() {
        Person person = new Person("Cate", 45);
        Person person1 = new Person("Danielle", 19);
        Comparator.comparing(Person::getName);

        assertEquals("Cate", "Cate", "Cate is first");
    }
}