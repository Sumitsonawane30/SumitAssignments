import java.util.Scanner;
public class MonthNumberProgram{
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a month Number:");
    i=sc.nextInt();

    if(i<1 || i>12){
        throw new NumberFormatException("\n Exception Error occured");
    }
    else{
        System.out.println("No. is Correct");

    }





}