public class StudentSortTest {
    public static void main(String[] args) {
        Student s[] = new Student[10];

        s[0] = new Student("Kim",2.3);
        s[1] = new Student("Lee",3.0);
        s[2] = new Student("Park",1.3);
        s[3] = new Student("Choi",4.0);
        s[4] = new Student("Jung",3.1);
        s[5] = new Student("Seok",4.4);
        s[6] = new Student("Yoon",3.7);
        s[7] = new Student("Cho",3.9);
        s[8] = new Student("Ryu",3.2);
        s[9] = new Student("Ji",2.7);

        Ars.descending(s);
        for(int i = 0; i < 10; i++) {
            System.out.println(s[i]);
        }
    }
}
