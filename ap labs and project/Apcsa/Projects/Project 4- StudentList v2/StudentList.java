import java.util.Scanner;
class StudentList{
    public static int count = 2;
    Scanner k = new Scanner(System.in);
    Student[] stu = new Student[3];
    public StudentList(){
        System.out.println("Pleas enter student information: ");
        System.out.println("Student Number, Student Name and GPA : ");
        for(int i = 0; i < 3; i++){
            String s = k.nextLine();
            String[] arr = s.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            stu[i] = new Student(a, arr[0], b, arr[3]);
        }
    }

    public void printLowestGPA(){
        int x = 0;
        int mn = stu[0]. GPA;
        for (int i = 0; i < stu.length; i++)
        {
            if (stu[i].getGPA() < mn)
            {
                mn = stu[i].GPA;
                x = i;
            }
        }
        System.out.println("Lowest GPA is: "+ stu[x].getGPA());
        System.out.println("Student Name is: " + stu[x].getName());
        System.out.println("Student Number is: "+ stu[x].getStudnumber());
        System.out.println("------------------------------");
    }

    public void printHighestGPA(){
        int x = 0;
        int max = stu[0].GPA;
        for (int i = 0; i < stu.length; i++)
        {
            if (stu[i].getGPA() > max)
            {
                max = stu[i].GPA;
                x = i;
            }
        }
        System.out.println("Highest GPA is: "+ stu[x].getGPA());
        System.out.println("Student Name is: "+ stu[x].getName());
        System.out.println("Student NUmber is: "+ stu[x].getStudnumber());
    }
}
