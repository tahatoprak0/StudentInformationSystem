package OOP_Part1.StudentInformationSystem;

public class Course {
    Teacher teacher;
    String courseName;
    String courseCode;
    String prefix;
    int note=0;

   public Course(String courseName,String courseCode,String prefix,Teacher teacher){
       this.courseCode=courseCode;
       this.courseName=courseName;
       this.prefix=prefix;
       addTeacher(teacher);
    }

    public void addTeacher(Teacher teacher){
       if (this.prefix.equals(teacher.branch)){
           this.teacher=teacher;
           System.out.println(teacher.name+" Başarılı bir şekilde " + courseName +" dersine atandı");
       }else System.out.println( teacher.name+" "+courseName +" dersini veremez.");
    }

    void printCourse(){
        System.out.println("====================");
       System.out.println("Course:"+courseName+
                "\nTeacher:"+teacher.name);
        System.out.println("====================");
    }



}
