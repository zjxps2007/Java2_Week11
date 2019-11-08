public interface OperateCar {
    void start();
    void stop();
    void setSpeed(int speed);
    void turn(int degree);

    default public void fly() {
        System.out.println("하늘을 날고 있음");
    }
}
