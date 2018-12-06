import java.util.Scanner;
class Student{
    public int Studnumber;
    public String StudentName;
    public int GPA;
    public Student (int Studnumber,String StudentName,int GPA){
        this. GPA =  GPA;
        this.StudentName = StudentName;
        this.Studnumber = Studnumber;
        // Read the student information from keyboard and set the attributes.
    }

    public int getStudnumber(){
        return Studnumber;
    }

    public int getGPA(){
        return GPA;
    }

    public String getName(){
        return StudentName;
    }
}
