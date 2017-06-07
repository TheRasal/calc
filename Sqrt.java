


public class Sqrt implements Calculator {
    private double a;
    private double b;

    public Sqrt(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Sqrt(String s) {
    }

    public Sqrt() {
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
        return Math.sqrt(a);
    }
}
