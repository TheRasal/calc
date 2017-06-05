public class Delenie implements Calculator {
    private String a;
    private String b;


    public Delenie(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public Delenie() {
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    @Override
    public Integer calc(){
        return Integer.valueOf(a)/Integer.valueOf(b);
    }
}
