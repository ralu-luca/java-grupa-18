import java.util.*;

public class MainPerson {
    public static void main(String[] args) {
        Person ana = new Person("Ana", 27);
        Person vlad = new Person("Vlad", 19);
        Person ion = new Person("Ion", 62);


        Collection<Person> persons = new TreeSet<>(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
        persons.add(ana);
        persons.add(vlad);
        persons.add(ion);

        final Iterator<Person> personIterator = persons.iterator();
        System.out.print("TreeSet: ");
        while (personIterator.hasNext())
            System.out.print(personIterator.next()
                    + ", ");
        System.out.println();


        Map<Person, List<Hobby>> hobbyMap = new HashMap<>();
        List<Hobby> hobbyList = new ArrayList<>();
            hobbyList.add(new Hobby(3, "Reading","France", Collections.singletonList(new Address("Violin", 15, "Dubai"))));
            hobbyList.add(new Hobby(4, "Running","England", Collections.singletonList(new Address("Comet", 7, "London"))));
            hobbyList.add(new Hobby(2, "Surfing","Italy", Collections.singletonList(new Address("Io", 12, "Rome"))));

            hobbyMap.put(ana, hobbyList);

            List<Hobby> hobbyList1 = new ArrayList<>();
            hobbyList1.add(new Hobby(2, "Dancing","Spain", Collections.singletonList(new Address("Sun", 3, "Madrid"))));
            hobbyList1.add(new Hobby(1, "Karate", "Romania", Collections.singletonList(new Address("Mars", 12, "Bucharest"))));
            hobbyList1.add(new Hobby(3, "Singing", "Spain", Collections.singletonList(new Address("Venus", 6, "Valencia"))));

            hobbyMap.put(ion, hobbyList1);

            hobbyMap
                    .entrySet() // get Set as Stream
                    .forEach( // loop over Set
                            entry -> // lambda as looping over set entries implicitly returns an Entry
                                    System.out.println(
                                            entry.getKey() // get the key
                                                    + "="
                                                    + entry.getValue() // get the value
                                    ));
        }
    }



