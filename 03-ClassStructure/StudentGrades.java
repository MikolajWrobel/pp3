public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    public double lowestGrade(){
        double x = grades[0];
        for (int i=0; i < grades.length - 1; i++){
            if (grades[i] < x){
                x = grades[i];
            }
        }
        return x;
    }
   


    public int numberOfGrades(){
        int counter = 0;
        for (int i=0; i < grades.length; i++){
            counter += 1;
        }
    return counter;
    }

    public static void main(String[] args){

        double[] a = {2.0,3.0,4.0,5.0};
        StudentGrades sg1 = new StudentGrades("chujek", a);
        System.out.println(sg1.lowestGrade());
        System.out.println(sg1.numberOfGrades());
}
}
