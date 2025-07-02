class Shap{
    public void area(){
        System.err.println("Display Area");
    }
}
class triangle extends Shap{
    public void Triangle_area(int l,int b){
        double result=0.5*(l*b);
        System.err.println("Area Triangle : "+result);
    }
}
class circle extends triangle{
    public void circle_area(int r){
        double result=3.14*(r*r);
        System.err.println("Area of Circle : "+result);
    }
}
public class solution{
    public static void main(String[] args) {
        circle t1=new circle();
        t1.area();
        t1.Triangle_area(10,20);
        t1.circle_area(5);
    }
}