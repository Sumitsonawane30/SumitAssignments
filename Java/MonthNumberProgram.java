import java.util.Scanner;

public class MonthNumberProgram {
    public void month(int i) throws NumberFormatException {

        if (i < 1 || i > 12) {
            throw new NumberFormatException("\n Exception Error occured");
        } else {
            System.out.println("No. is Correct");

        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month No.:");
        n=sc.nextInt();
        MonthNumberProgram m=new MonthNumberProgram();
        m.month(n);

        System.out.println("Rest of the Code");

    }

}