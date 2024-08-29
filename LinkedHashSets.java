public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
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
    return "Person {name=" + name + ", n=" + n + "}";
  }

}

public class LinkedHashSets {
  public static void main(String[] args) {
    // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it
    // using Iterator and While Loop
    LinkedHashSet<Person> links = new LinkedHashSet<Person>();
    links.add(new Person("John", 1));
    links.add(new Person("Alice", 2));
    links.add(new Person("joy", 3));
    Iterator it = links.iterator();
    while (it.hasNext()) {
      Person p = (Person) it.next();
      System.out.println(p);
    }

  }

}
}
