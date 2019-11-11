public class Rectangle extends Shape implements Compare{
    private int width, height;

    public Rectangle() {
        width = 0;
        height = 0;
    }
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    public Rectangle(int x, int y, int w, int h) {
        super(x, y);
        width = w;
        height = h;
    }
    public int area() {

        return height*width;
    }

    public int comparing(Object o) {
        Rectangle r = (Rectangle)o;
        if(this.area() > r.area()) return 1;
        if(this.area() < r.area()) return -1;
        return 0;
    }
    public String toString() {

        return (super.toString()+"width: "+width+" \theight: "+ height);
    }
}
