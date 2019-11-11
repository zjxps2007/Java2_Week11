public class Student extends Person implements Compare{
    //변수 선언
    protected double gpa;

    public Student() {
        gpa = 0.0;
    }
    //생성자
    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }
    //문자열로 반환 메소드
    public String toString() {
        final String GPA ="  \tGAP: ";
        return (name + GPA + gpa);
    }
    //인터페이스로 받은 수를 현제랑 비교
    public int comparing(Object o) {
        Student s = (Student)o;
        if (gpa > s.gpa) return 1;
        if (gpa < s.gpa) return -1;
        return 0;
    }
}
