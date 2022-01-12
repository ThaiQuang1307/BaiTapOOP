package Cau2;

public class QuadraticFunction {
    public int a;
    public int b;
    public int c;

    public QuadraticFunction(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solution(){
        if (this.a == 0){
            System.out.println("Khong la phuong trinh bac 3");
        }else {
            double delta = this.b * this.b - 4 * this.a * this.c;
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }else if (delta == 0){
                double nghiem = -this.b / (2 * this.a);
                System.out.println("Phuong trinh co nghiem duy nhat: x = " + nghiem);
            }else {
                double nghiem1 = (-this.b + Math.sqrt(delta)) / (2 * a);
                double nghiem2 = (-this.b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + nghiem1 + ", x2 = " + nghiem2);
            }
        }
    }
}
