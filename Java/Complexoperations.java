
import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolBarUI;

public class Complexoperations {
    public static void main(String[] args) {
        int a1,a2,b1,b2,a,b;
        char operator;
        
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter First complex No.: a+bi\n\ta: ");
        a1=sc.nextInt();
        System.out.print("\tb: ");
        b1=sc.nextInt();
        System.out.println("Enter Second Complex No.: a+bi");
        System.out.print("\ta: ");
        a2=sc.nextInt();
        System.out.print("\tb: ");
        b2=sc.nextInt();

        System.out.println("Choose an operator : +, -, *,or /");
        operator =sc.next().charAt(0);

        switch(operator){
            case '+':
                a=a1+a2;
                b=b1+b2;
                System.out.format("Addition of complex No. is:\n(%d+%di)+(%d+%di)=(%d+%di)",a1,b1,a2,b2,a,b);
                break;
            
            case '-':
                a=a1-a2;
                b=b1-b2;
                System.out.format("Addition of complex No. is:\n(%d+%di)-(%d+%di)=(%d+%di)",a1,b1,a2,b2,a,b);
                break;
            
            case '*':
                a=(a1*a2)-(b1*b2);
                b=(a1*a2)+(b1*a2);
                System.out.format("Addition of complex No. is:\n(%d+%di)*(%d+%di)=(%d+%di)",a1,b1,a2,b2,a,b);
                break;
            case '/':
                a=a1/a2;
                b=b1/b2;
                System.out.format("Addition of complex No. is:\n(%d+%di)/(%d+%di)=(%d+%di)",a1,b1,a2,b2,a,b);
                break;
            
            default:
                System.out.println("Invalid Operator");
                break;


            }
            sc.close();





    }

}
