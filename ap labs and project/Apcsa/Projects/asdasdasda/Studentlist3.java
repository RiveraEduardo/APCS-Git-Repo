import java.util.Scanner;

class Student{

    public int SSN;

    public String StudentName;

    public int StudentAge;

    public String Major;

    public Student (int SSN,String StudentName,int StudentAge,String Major){
        this.SSN = SSN;
        this.StudentName = StudentName;
        this.StudentAge = StudentAge;
        this.Major = Major;
        // Read the student information from keyboard and set the attributes.
    }
    public int getSSN(){
        return SSN;
    }
    public int getAge(){
        return StudentAge;
    }
    public String getName(){
        return StudentName;
    }
    public String getMajor(){
        return Major;
    }
}
class StudentList{
    public static int count = 2;

    Scanner k = new Scanner(System.in);

    Student[] stu = new Student[3];

    public StudentList(){
        /*
        stu[0] = new Student(1212, "ankur",22, "computersciene");
        stu[1] = new Student(1323, "ronak",26, "computersciene");
        stu[2] = new Student(1434, "ronak",28, "computersciene");
        stu[3] = new Student(1582, "David",38, "Electrical");
        stu[4] = new Student(1672, "Mike ",11, "Civil");
        stu[5] = new Student(1538, "ronak",25, "Electrical");
        stu[6] = new Student(1688, "Jhon ",26, "Civil");
         */
        System.out.println("Pleas enter student information: ");
        System.out.println("Student SSN, Student Name, Student Age and Major : ");
        for(int i = 0; i < 3; i++){
            String s = k.nextLine();
            String[] arr = s.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            stu[i] = new Student(a, arr[1], b, arr[3]);
        }
    }
    public void printYoungestStudent(){
        int x = 0;
        int mn = stu[0].StudentAge;
        for (int i = 0; i < stu.length; i++)
        {
            if (stu[i].getAge() < mn)
            {
                mn = stu[i].StudentAge;
                x = i;
            }
        }
        System.out.println("Youngest Student Age is: "+ stu[x].getAge());
        System.out.println("Student Name is: " + stu[x].getName());
        System.out.println("Student Major is: "+ stu[x].getMajor());
        System.out.println("Student SNN is: "+ stu[x].getSSN());
        System.out.println("------------------------------");
    }
    public void printOldestStudent(){
        int x = 0;
        int max = stu[0].StudentAge;
        for (int i = 0; i < stu.length; i++)
        {
            if (stu[i].getAge() > max)
            {
                max = stu[i].StudentAge;
                x = i;
            }
        }
        System.out.println("Oldest Student Age is: "+ stu[x].getAge());
        System.out.println("Student Name is: "+ stu[x].getName());
        System.out.println("Student Major is: "+ stu[x].getMajor());
        System.out.println("Student SNN is: "+ stu[x].getSSN());
    }
}
public class Studentlist3{
    public static void main(String[] args){
        StudentList s = new StudentList();
        s.printYoungestStudent();
        s.printOldestStudent();

    }
}