abstract class Car{
    abstract void display();
}

public class Anonymous{
    public static void main(String[] args) {
        Car c1=new Car(){
            //Beginning of Anonymous class
            void display(){
                System.out.println("I love Cars!!");
            }
        };
    
    c1.display();
    }

}