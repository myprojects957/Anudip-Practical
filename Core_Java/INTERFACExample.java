
interface Animal {
    void walk();
}

class Dog implements Animal {
    
    public void walk() {
        System.out.println("Dog is Walking");
    }
}


public class INTERFACExample {
    public static void main(String[] args) {
        Animal D1 = new Dog();
        D1.walk();
    }
}

