public class Shape {
    protected int x, y;

    public Shape() {
        x = 0;
        y = 0;
    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return ("Shape at x :" + x + " y: " + y);
    }
}
