package Cau1;

public class Main {

    public static void main(String[] args) {
        Student s = new Student("Trinh Thai Quang", 20, "2019");
        Student s2 = new Student("aaaaaa",20,"2019");
        Student s3 = new Student("bbbbbb",20,"2020");

        s.info();
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));

    }
}
