import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Student obj= new Student("Kimon",'C','1');

        System.out.println("-----STUDENT's Grade----------");
        obj.getCurrentGrade();

        System.out.println("-----UPGRADE on DB List----------");
        obj.dbGetStudentList();
        obj.updateGradeList(obj, true);
        obj.studentList();

        System.out.println("-----UPGRADE Manually----------");
         obj.upGrade( obj.getGrade());
         obj.upGrade( obj.getGrade());
         obj.downGrade( obj.getGrade());
         obj.downGrade( obj.getGrade());

        System.out.println("-----UPGRADE Randomly----------");
         obj.setGrade('F');
         obj.getCurrentGrade();
         obj.downGrade( obj.getGrade());

    }
}
