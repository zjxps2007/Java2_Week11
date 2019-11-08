public class Person {
    protected String name;

    public Person() {
        name = "";
    }
    public Person(String name) {
        this.name = name;
    }
    public int comparing(Person p) {
        return this.name.compareTo(p.name);
    }
}
