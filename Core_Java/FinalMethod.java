class Car {
    final void Run() {
        System.out.println("Running");
    }
}

class Vehicle extends Car {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.Run();       
        v1.display();   
        Car c1 = new Car();
        c1.Run();     
    }
}
