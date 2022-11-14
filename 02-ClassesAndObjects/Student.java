public class Student {
    //Atrybuty
    String name;
    int age;
    String studentID;
    boolean isValid;
    int semesterNumber;
    double avgGrade;
    
    //Zachowania
    public void sayHello(){
        System.out.println("Hello!");
    }
    public void displayName(){
        System.out.println("Mam na imię " + name);
    }
    public void displayAge(){
        System.out.println("Mam " + age + " lat");
    }
    public void displayStudentInf(){
        System.out.println("Name: " + name);
        System.out.println("Semestr: " + semesterNumber);
        System.out.println("Średnia ocen: " + avgGrade);
        
    }
    public void changeIdStatus(){
        isValid = !isValid;
    }
    public void showStudentStatus(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentID);
        System.out.println("Validation: " + isValid);
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Mikołaj";
        s1.age = 20;
        s1.studentID = "221527";
        s1.isValid = true;
        s1.semesterNumber = 3;
        s1.avgGrade = 5.0;
        s1.sayHello();
        s1.showStudentStatus();
        s1.changeIdStatus();
        s1.showStudentStatus();
    }
}