

public class Solver implements SolverSqrt {
   private Calculator plus;
   private Calculator minus;
   private Calculator delenie;
   private Calculator sqrt;
   private Calculator umnozhenie;
   private double a;
   private double b;
   private double c;


    public Solver(Calculator plus, Calculator minus, Calculator delenie, Calculator sqrt, Calculator umnozhenie, double a, double b, double c) {
        this.plus = plus;
        this.minus = minus;
        this.delenie = delenie;
        this.sqrt = sqrt;
        this.umnozhenie = umnozhenie;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Solver() {
    }

    private double getResult(double x,double y, Calculator calc){
       calc.setA(x);
       calc.setB(y);
       return calc.calc();
    }

    public Double getX(double a, double b, double c, Calculator calc){
      double b2=getResult(b,b,umnozhenie);
      double fourA=getResult(4,a,umnozhenie);
      double fourAC=getResult(fourA,c,umnozhenie);
      double d= getResult(b2,fourAC,minus);
      double minusB=getResult(-1,b,umnozhenie);
      double sqrtD=getResult(d,0,sqrt);
      double upper=getResult(minusB,sqrtD,calc);
      double lower=getResult(2,a,umnozhenie);

      return getResult(upper,lower,delenie);
}
    @Override
    public void getX1() {
        System.out.println(getX(a,b,c,plus));

    }
    public void getX2(){
        System.out.println(getX(a,b,c,minus));

    }

    public Calculator getPlus() {
        return plus;
    }

    public void setPlus(Calculator plus) {
        this.plus = plus;
    }

    public Calculator getMinus() {
        return minus;
    }

    public void setMinus(Calculator minus) {
        this.minus = minus;
    }

    public Calculator getDelenie() {
        return delenie;
    }

    public void setDelenie(Calculator delenie) {
        this.delenie = delenie;
    }

    public Calculator getSqrt() {
        return sqrt;
    }

    public void setSqrt(Calculator sqrt) {
        this.sqrt = sqrt;
    }

    public Calculator getUmnozhenie() {
        return umnozhenie;
    }

    public void setUmnozhenie(Calculator umnozhenie) {
        this.umnozhenie = umnozhenie;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
