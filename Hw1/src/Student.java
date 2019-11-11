public class Student extends Person implements Compare{
    protected double gpa;

    public Student() {
        gpa = 0.0;
    }
    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }
    public String toString() {
        final String GPA ="  \tGAP: ";
        return (name + GPA + gpa);
    }
    public int comparing(Object o) {
        Student s = (Student)o;
        if (gpa > s.gpa) return 1;
        if (gpa < s.gpa) return -1;
        return 0;
    }
}
