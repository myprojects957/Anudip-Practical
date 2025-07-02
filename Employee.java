public class Employee {
    protected int id,age;
    protected String name;
    protected boolean ispermanent;

    public static void main(String[] args) {
        Employee em1 = new Employee();
        em1.id = 100;
        em1.age = (int)35.5;
        em1.ispermanent = true;

        System.out.println("successfully started !!");
    }    
}
