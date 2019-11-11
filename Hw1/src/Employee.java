public class Employee extends Person implements Compare{
    //변수 생성
    protected double grossPay;

    public Employee() {

        grossPay = 0.0;
    }
    //생성자
    public Employee(String name, double grossPay) {
        super(name);
        this.grossPay = grossPay;
    }
    //문자열로 변환 메소드
    public String toString(){
        final String DOLLAR_SIGN = "  \t$";
        return (name + DOLLAR_SIGN + grossPay);
    }
    //인터페이스로 받은 수를 현제랑 비교
    public int comparing(Object o) {
        Employee e = (Employee)o;
        if(grossPay > e.grossPay) return 1;
        if(grossPay < e.grossPay) return -1;
        return 0;
    }
}
