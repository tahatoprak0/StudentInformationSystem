package OOP_Part1.StudentInformationSystem;

public class Teacher {
    String name;
    String pNumber;
    String branch;

   public Teacher(String name, String pNumber, String branch) {
       this.name=name;
       this.pNumber=pNumber;
       this.branch=branch;
    }

    void printTeacher(){
        System.out.println("=====================");
        System.out.println("Name\t\t:"+this.name+
                "\nPhone Number:"+this.pNumber+
                "\nBranch\t\t:"+this.branch);
        System.out.println("=====================");
    }

}
