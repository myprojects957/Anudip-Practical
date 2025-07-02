class Student{
    static String Clg = "DYP";
    String Name;
    int Age;

    Student(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }
}
public class StaticClass {
    public static void main(String[] args) {
        Student s1 = new Student("Sanket",21);
        System.out.println(s1.Name+s1.Clg);
        Student s2 = new Student("Nagesh", 22);
        System.out.println(s2.Name+s2.Clg);
        
    }
}
