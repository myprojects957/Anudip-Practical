class Constructor {
    String Name;
    int Age;
    Constructor() {
        System.out.println("This is Constructor");
    }

    Constructor(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }
    void display(){
    System.out.println("Name : "+Name);
    System.out.println("Age : "+Age);
    }
    Constructor(Constructor s) {
    this.Name = s.Name;
    this.Age = s.Age;
    }
}
public class solution1{
    public static void main(String[] args) {
        Constructor c2=new Constructor("Sanket",23 );
        c2.display();
        Constructor c1=new Constructor(c2);
        System.out.println(c1.Name);
    }
}

