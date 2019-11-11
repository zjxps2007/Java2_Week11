public class Shape {
    protected int x, y;
    //생성자
    public Shape() {
        x = 0;
        y = 0;
    }
    //생성자
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //문자열로 반환 메소드
    public String toString() {
        return ("Shape at x :" + x + " y: " + y + " \t");
    }
}
