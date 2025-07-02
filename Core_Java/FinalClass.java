final class Car {
    final void Run() {
        System.out.println("Running");
    }
}

public class FinalClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.Run(); 
    }
}
