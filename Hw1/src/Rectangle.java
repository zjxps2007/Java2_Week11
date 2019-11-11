public class Rectangle extends Shape implements Compare{
    private int width, height;

    public Rectangle() {
        width = 0;
        height = 0;
    }
    //생성자
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    //생성자
    public Rectangle(int x, int y, int w, int h) {
        super(x, y);
        width = w;
        height = h;
    }
    //넓이 구하는 메소드
    public int area() {

        return height*width;
    }
    //인터페이스로 받은 수를 현제랑 비교
    public int comparing(Object o) {
        Rectangle r = (Rectangle)o;
        if(this.area() > r.area()) return 1;
        if(this.area() < r.area()) return -1;
        return 0;
    }
    //문자로 변환 메소드
    public String toString() {

        return (super.toString()+"width: "+width+" \theight: "+ height);
    }
}
