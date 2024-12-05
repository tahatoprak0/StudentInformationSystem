package OOP_Part1.StudentInformationSystem;

public class SystemTest {
    public static void main(String[] args) {
        Teacher ahmetGül = new Teacher("Ahmet Gül", "+905327653478", "Math");


        Teacher yasarGuler = new Teacher("Yaşar Güler", "+905672345676", "Chemist");


        Teacher tevfikFikret = new Teacher("Tevfik Fikret", "+904537891224", "Physic");


        Course math=new Course("Math","101","Math",ahmetGül);


        Course chemistry= new Course("Chemistry","102","Chemist",yasarGuler);

        Course physic = new Course("Physic","103","Physic",tevfikFikret);

        Student tahaAkgul=new Student("Taha Akgul","37764374",3,math,chemistry,physic);

        tahaAkgul.addNote(50,60,80);
        tahaAkgul.avarage();
        tahaAkgul.printNote();
        tahaAkgul.isPassCheck();


    }
}
