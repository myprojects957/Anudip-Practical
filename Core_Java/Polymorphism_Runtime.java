

public class Polymorphism_Runtime {
    public static void main(String[] args) {
        Dog D1 = new Dog();
        D1.Eat();
        D1.Sound();
    }
}
class Animal {
    void Eat() {
        System.out.println("Animal is Eating");
    }

    public void Sound() {
    }
}

class Dog extends Animal {
    @Override
    public void Sound() {
        System.out.println("Dog Barks");
    }
}
