// creat a java program using abstraction using model a payment system
//1-creat a abstract class name payment
//2-add an abstract method call process payment
//3-creat subclasses 1-credit card payment , 2- upi payment 
//4-impliment process payment method in both subclasses 
//5-in the main method 1-use abstract class referance to call both payments type 

abstract class Payment{
    abstract void ProcessedPayment(double Amount);
}
class Credit_card_payment extends Payment{
    @Override
    void ProcessedPayment(double Amount){
        System.out.println("Amount : "+Amount);
    }
}
class UPI_payment extends Payment{

    @Override
    void ProcessedPayment(double Amount){
        System.out.println("Amount : "+Amount);
    }
}
public class Abstract_Class2 {
    public static void main(String[] args) {
        Payment P1=new UPI_payment();
        Payment P2=new Credit_card_payment();
        P1.ProcessedPayment(20000);
        P2.ProcessedPayment(30000);
    }
}
