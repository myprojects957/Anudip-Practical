class Inheritance {
    public void Show(){
        System.out.println("This is GrandParent");
    }
}
class Parent extends Inheritance{
    public void how(){
        System.out.println("This is parent");
    }
}
class Child1 extends Parent{
    public void ow(){
        System.out.println("This is Child");
    }
}
class Child2 extends Child1{
    public static void main(String[] args) {
        Child2 c1=new Child2();
        c1.Show();
        c1.how();
        c1.ow();
    }
}
