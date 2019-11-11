public class RectangleSortTest {
    public static void main(String[] args) {
        Rectangle[] r = new Rectangle[5];

        r[0] = new Rectangle(10, 3);
        r[1] = new Rectangle(10, 4);
        r[2] = new Rectangle(5, 3);
        r[3] = new Rectangle(7, 2);
        r[4] = new Rectangle(6, 8);

        Ars.descending(r);
        for(int i =0; i < 5; i++) {
            System.out.println(r[i]);
        }
    }
}
