interface animal {
    public void walk();
    public void talk();
    public void clock();
    
}
class horse implements animal{
    @Override
    public void walk(){
        System.out.println("my horsie can walk ");
    };
    @Override
    public void talk(){
        System.out.println("my horsie can talk");
        
    };
    @Override
    public void clock(){
        System.out.println("my horsie can see the clock ");
        
    };
}
public class Interface {
    public static void main(String[] args) {
        horse majnu = new horse();
        majnu.talk();
        majnu.walk();
        majnu.clock();
    }
}
