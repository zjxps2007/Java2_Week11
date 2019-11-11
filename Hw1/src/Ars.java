public class Ars {
    public static void descending(Compare[] p) {
        //내림차순 정렬
        for (int i = 0; i < p.length; i++) {
            for (int j = i; j < p.length; j++) {
                //p[j] 가 p[i] 보가 클때
                if (p[i].comparing(p[j]) == -1) {
                    //교환
                    Compare temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
    }
}