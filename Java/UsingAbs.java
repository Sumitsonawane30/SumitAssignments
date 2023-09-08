//Abstract method in Java. Adding two numbers.

abstract class Operation{
     
     
    public abstract void Sum(int a, int b);
    
}

class Add extends Operation{
    
    public void Sum(int a, int b){
        
          int c = a + b;
          System.out.println("Addition of two numbers is: "+c);
    }
    
    
    public static void main(String args[]){
          
         Operation ob = new Add();//While declaring the object, extended class or the abstract class can be used.
         
         ob.Sum(3, 7);  //we are passing the values to Method name "sum"
   }
}
    
