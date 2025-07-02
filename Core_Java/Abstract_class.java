
abstract class Animal{
    public abstract void Sound();
    public void Eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    @Override
    public void Sound() {
        System.out.println("Dog is Barks");
    }

}
public class Abstract_class {
    public static void main(String[] args) {
      Animal d1=new Dog();
      d1.Eat();
      d1.Sound();  
    }
    
}
