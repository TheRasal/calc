/**
 * Created by TMS on 02.06.2017.
 */
public class Plus implements Calculator {
    private double  a;
    private double  b;

    public Plus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getB() {
        return b;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }

    @Override
    public Double calc() {
        return a+b;
    }
}
