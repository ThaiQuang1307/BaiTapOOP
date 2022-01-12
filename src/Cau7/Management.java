package Cau7;

import java.util.ArrayList;

public class Management {
    private ArrayList<Student> listStudent;

    public Management() {
    }

    public Management(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public void Add(Student student){
        this.listStudent.add(student);
    }

    public Student search(String id){
        for (Student student : this.listStudent) {
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    public Student highestAvg(){
        Student temp = this.listStudent.get(0);
        double max = (temp.getMath() + temp.getPhysic() + temp.getChemistry()) / 3;
        for (Student student : this.listStudent) {
            double trungBinh = student.getMath() + student.getPhysic() + student.getChemistry();
            if (trungBinh > max){
                max = trungBinh;
                temp = student;
            }
        }
        return temp;
    }

    public void print(){
        System.out.println("-----------------------------");
        for (Student student: this.listStudent) {
            student.toString();
        }
        System.out.println("-----------------------------");
    }
}
