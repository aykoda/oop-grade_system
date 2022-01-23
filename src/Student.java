import java.util.*;
import java.util.stream.Collectors;

public class Student {

    private String name;
    private Character grade;
    private Character group;
    private final String SECRET_NICK_NAME = "MySecretNickName";
    private String GRADE_UPDATE ="";
    private final List<Character> GRADE_SET = Arrays.asList(new Character[]{'A','B','C','D','E','F'});
    private  List<Character> GRADE_SET_DESC = new ArrayList<>(); //= Arrays.asList(new Character[]{'F','E','D','C','B','A'});
    private List<Character> gradeSet = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public  Student(){
        reverseGardeList();
    }

    public  Student(String name, Character grade, Character group){

        this.name=name;
        this.grade = grade;
        this.group = group;

        reverseGardeList();
    }

    private void reverseGardeList(){
        //Collections.sort(GRADE_SET, Collections.reverseOrder());
        GRADE_SET_DESC=GRADE_SET.stream()
                .sorted(Comparator.reverseOrder()).toList();
                //.collect(Collectors.toList());

    }

    public void dbGetStudentList(){
        students.add(new Student("Kimon",'B','1'));
        students.add(new Student("Matrix",'C','1'));
        students.add(new Student("Davidof",'D','2'));
        students.add(new Student("Simona",'A','2'));
        students.add(new Student("Nill",'F','3'));
    }

    public List<Student> studentList(){
        for(Student std: students){
            System.out.println(std.name +" Grade:"+ std.grade);
        }
        return students;
    }

    public Character updateGrade(Character grade){
        int indx;
        indx = gradeSet.indexOf(grade);
        if(indx !=0) {
            indx--;
            setGrade(gradeSet.get(indx));
            System.out.printf("%s's %s grade %s to %s!\n",this.getName(), grade, GRADE_UPDATE,this.getGrade());
        }else
            System.out.printf( "%s can't be %s graded!\n", grade, GRADE_UPDATE);
        return getGrade();
    }
    public Character upGrade(Character grade){
        GRADE_UPDATE = "UP";
        gradeSet = GRADE_SET;

        return updateGrade(grade);
    }
    public Character downGrade(Character grade){
        GRADE_UPDATE = "DOWN";
        gradeSet =GRADE_SET_DESC;

        return updateGrade(grade);
       /* int indx;
        indx = GRADE_SET.indexOf(grade);
        if(indx != GRADE_SET.size()-1) {
            indx++;
            setGrade(GRADE_SET.get(indx));
        }
        return getGrade();*/
    }

    public Student updateGradeList(Student updStudent, boolean upGrade){

        for(Student updList: students){
            if (updList.name == updStudent.getName() && updList.group==updStudent.getGroup()){
                if (upGrade)
                    updList.setGrade(upGrade(updStudent.getGrade()));
                else
                    updList.setGrade(downGrade(updStudent.getGrade()));

                return updList;
            }
        }
        System.out.println("The Student is not found.");
        return updStudent;
    }

    public void getCurrentGrade(){
        System.out.printf( "%s's CURRENT grade is %s.\n", this.getName(),this.getGrade());
    }

    public String getName() {
        return name;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character newGrade) {
         grade=newGrade;
    }

    public Character getGroup() {
        return group;
    }
}
