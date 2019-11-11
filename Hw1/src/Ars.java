public class Ars {
    public static void descending(Compare[] p) {
        //정렬
        for (int i = 0; i < p.length; i++) {
            for (int j = i; j < p.length; j++) {
                if (p[i].comparing(p[j]) == -1) {
                    Compare temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
    }
}