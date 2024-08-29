public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
  import java.util.*;

class Person {
    String name;
    int n;

    Person(String name, int n) {
        this.name = name;
        this.n = n;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", n=" + n + "]";
    }

}

public class HashSets {
    // Prepare Hashset object here and add person class objects in them iterate it
    // by using for each
    public static void main(String[] args) {
        HashSet<Person> person = new HashSet<Person>();
        person.add(new Person("John", 25));
        person.add(new Person("John", 25));
        person.add(new Person("hello", 34));

        for (Person p : person) {
            System.out.println(p);
        }
    }
}
}
