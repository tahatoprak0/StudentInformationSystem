package OOP_Part1.StudentInformationSystem;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stdNumber;
    int classes;
    double avarage;
    boolean isPass;

    public Student(String name, String stdNumber, int classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stdNumber = stdNumber;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.isPass = false;

    }

    public double avarage() {
        double result = (course1.note + course2.note + course3.note) / 3;
        System.out.println(this.name + " Avarage :" + result);
        this.avarage=result;
        return result;
    }

    public void addNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            course1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            course2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            course3.note = note3;
        }
    }

    void printNote() {
        System.out.println("Student:" + this.name +
                "\n" + course1.courseName + " Note:" + course1.note +
                "\n" + course2.courseName + " Note:" + course2.note +
                "\n" + course3.courseName + " Note:" + course3.note);
    }

    void isPassCheck(){
        if (avarage()>=55){
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }else System.out.println("Maalesef Kaldınız");
    }


}
