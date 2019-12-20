public class Person {
    public static final double PI = 3.14;
    String name; // attribute or instance variable
    int age = 0;

    //constructor implicit
    public Person() {
        this.age = 0;
        System.out.println("Constructorul implicit a fost apelat");
        this.name = "no name";
    }

    //constructor explicit
    public Person(String name) {
        System.out.println("Constructor implicit cu un paramentru a fost apelat");
        this.name = name;
    }
    //metode
}
