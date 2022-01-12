package Cau4;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean check(){
        return ((this.a + this.b) > this.c) && ((this.b + this.c) > this.a) && ((this.c + this.a) > this.b);
    }

    public int perimeter(){
        if (this.check()){
            return this.a + this.b + this.c;
        }
        return -1;
    }

    public double area(){
        if (this.check()){
            double P = 1.0 * (this.a + this.b + this.c) / 2;
            double S = Math.sqrt(P * (P - this.a) * (P - this.b) * (P - this.c));
            return S;
        }
        return -1;
    }
}
