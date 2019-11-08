public class Employee extends Person implements Compare{
    protected double grossPay;

    public Employee() {
        grossPay = 0.0;
    }
    public Employee(String name, double grossPay) {
        super(name);
        this.grossPay = grossPay;
    }
    public String toString(){
        final String DOLLAR_SIGN = "  $";
        return (name + DOLLAR_SIGN + grossPay);
    }
    public int comparing(Object o) {
        Employee e = (Employee)o;
        if(grossPay > e.grossPay) return 1;
        if(grossPay < e.grossPay) return -1;
        return 0;
    }
}
