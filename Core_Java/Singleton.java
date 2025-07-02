public class Singleton {
    public String a;

    private static Singleton Object;
    private Singleton() {
        a = "Singleton instance";
    }
    public static Singleton getSingleInstance() {
        if (Object == null) {
            Object = new Singleton();
        }
        return Object;
    }
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getSingleInstance();
        System.out.println(obj1.a);
    }
}
