
import java.util.*;


public class Person {
    public static  final Comparator<Person> BY_NAME = Comparator.comparing(Person::getName);
    public static  final Comparator<Person> BY_AGE = Comparator.comparing(Person::getAge);
    private String name;
    private int age;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Comparator<Person> getBY_AGE() {
        return BY_AGE;
    }

    public Comparator<Person> getBY_NAME() {
        return BY_NAME;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}





