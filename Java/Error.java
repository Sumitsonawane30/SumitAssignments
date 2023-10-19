import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                try {
                    int data = 100 / 0;
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
                break;
            case 2:
                try {
                    String s = null;
                    System.out.println(s.length());
                } catch (NullPointerException e) {
                    System.out.println(e);
                }
                break;
            case 3:
                try {
                    String s = "abc";
                    int i = Integer.parselnt(s);
                } catch (NumberFormatException e) {
                    System.out.println(e);
                }
                break;
            case 4:
                try {
                    int a[] = new int[3];
                    a[5] = 10;
                } catch (ArrayIndexoutofBoundsException e) {
                    System.out.println(e);
                }
                break;

        }

    }
}