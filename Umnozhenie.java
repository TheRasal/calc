public class Umnozhenie implements Calculator {
   private double a;
   private double b;


    public Umnozhenie(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Umnozhenie() {
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
    public Double calc(){
        return a*b;

    }


}
