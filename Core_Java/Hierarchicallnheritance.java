

class Shapes{
    public void area(){
        System.out.println("Display Area");
    }
}
class Triangle extends Shapes{
    public void trianglearea(){
        System.out.println("Display Area");
    }
}
class Equilaterialtriangle extends Shapes{
    public void Equilaterialtrianglearea(){
        System.out.println("Display Area");
    }

}
class HierarchicalInheritance {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.area();

        Triangle triangle = new Triangle();
        triangle.area(); 
        triangle.trianglearea(); 

        Equilaterialtriangle eqTriangle = new Equilaterialtriangle();
        eqTriangle.area(); 
        eqTriangle.Equilaterialtrianglearea(); 
    }
}