package Cau6;

public class Main {
    public static void main(String[] args) {
        Fraction ps1 = new Fraction(3,4);
        Fraction ps2 = new Fraction(5,6);


        System.out.println("Tong: " + ps1.add(ps2));
        System.out.println("hieu: " + ps1.minus(ps2));
        System.out.println("Nhan: " + ps1.time(ps2));
        System.out.println("Chia: " + ps1.div(ps2));

    }
}
