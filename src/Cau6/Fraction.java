package Cau6;

public class Fraction {
    private int number;
    private int denom;

    public Fraction(){}

    public Fraction(int number, int denom) {
        this.number = number;
        this.denom = denom;
    }

    public Fraction add(Fraction fractionInput){
        Fraction sum = new Fraction();
        sum.number = this.number * fractionInput.denom + this.denom * fractionInput.number;
        sum.denom = this.denom * fractionInput.denom;
        return sum.simplify();
    }

    public Fraction minus(Fraction fractionInput){
        Fraction sum = new Fraction();
        sum.number = this.number * fractionInput.denom - this.denom * fractionInput.number;
        sum.denom = this.denom * fractionInput.denom;
        return sum.simplify();
    }

    public Fraction time(Fraction fractionInput){
        Fraction sum = new Fraction();
        sum.number = this.number * fractionInput.number;
        sum.denom = this.denom * fractionInput.denom;
        return sum.simplify();
    }

    public Fraction div(Fraction fractionInput){
        Fraction sum = new Fraction();
        sum.number = this.number * fractionInput.denom;
        sum.denom = this.denom * fractionInput.number;
        return sum.simplify();
    }

    public Fraction simplify(){
        Fraction toiGian = new Fraction(this.number / Ucln(Math.abs(this.number), Math.abs(this.denom)),
                this.denom / Ucln(Math.abs(this.number), Math.abs(this.denom)));
        return toiGian;
    }

    public int Ucln(int a, int b){
        if (b == 0) return a;
        if (a % b == 0) return b;
        return Ucln(b, a%b);
    }

    public String toString(){
        return this.number + "/" + this.denom;
    }
}
