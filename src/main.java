import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Student obj= new Student("Kimon",'C','1');

        System.out.println(obj.getName() +" CURRENT grade " + obj.getGrade());

        System.out.println("-----UPGRADE on DB List----------");
        obj.dbGetStudentList();
        obj.updateGradeList(obj, true);
        obj.studentList();

        System.out.println("-----UPGRADE Manual----------");
        System.out.println(obj.getName() +" UP grade " + obj.upGrade( obj.getGrade()));
        System.out.println(obj.getName() +" DOWN grade " +obj.downGrade( obj.getGrade()));
        System.out.println(obj.getName() +" DOWN grade " +obj.downGrade( obj.getGrade()));

    }
}
