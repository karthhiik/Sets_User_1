public class Person{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
  import java.util.*;

class Person1 {
    private String name;
    private int n;

    public Person1(String name, int n) {
        this.name = name;
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Person1 [name=" + name + ", n=" + n + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + n;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person1 other = (Person1) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (n != other.n)
            return false;
        return true;
    }

}

public class Person {
    // prepare a Person Data With Getters and Setters,Constructor,ToString and
    // Override HashCode & Equals Methods in it
    public static void main(String[] args) {
        HashSet<Person1> hs = new HashSet<Person1>();
        Person1 ps1 = new Person1("hello", 12);
        Person1 ps2 = new Person1("hello", 12);
        Person1 ps3 = new Person1("tara", 14);
        ps1.setN(12);
        ps1.setName("hello");
        ps2.setN(12);
        ps2.setName("hello");
        ps3.setN(324);
        ps3.setName("jsd");
        hs.add(ps1);
        hs.add(ps2);
        hs.add(ps3);
        for (Person1 persons : hs) {
            System.out.println(persons);
        }

    }

}
}
