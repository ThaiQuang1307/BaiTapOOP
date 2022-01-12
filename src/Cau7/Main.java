package Cau7;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("1","quang1",1,2,3);
        Student s2 = new Student("2","quang2",4,5,6);
        Student s3 = new Student("3","quang3",7,8,9);
        Student s4 = new Student("4","quang4",10,11,12);
        Student s5 = new Student("5","quang5",13,14,15);


        Management danhSach = new Management();
        danhSach.Add(s1);
        danhSach.Add(s2);
        danhSach.Add(s3);
        danhSach.Add(s4);
        danhSach.Add(s5);

        danhSach.print();
    }
}
