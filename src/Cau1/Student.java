package Cau1;

public class Student {
    public String name;
    public int age;
    public String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public boolean equals(Student student){
        if (this.id.equals(student.id)){
            return true;
        }
        return false;
    }

    public void info(){
        System.out.println("Student[id=" + this.id + ", name=" + this.name + ", age=" + this.age + "]");
    }
}
