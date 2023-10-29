import java.util.*;

public class Generic_A {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Check even or odd");
        System.out.println("2.Check prime or not");
        System.out.println("3.Check Weather the No. is palindrome or not");
        System.out.println("Enter your choice:");
        ch = sc.nextInt();
        switch (ch) {
            case 1:// even or not
                int n;
                System.out.println("Enter the number you want to check:");
                n = sc.nextInt();
                ArrayList<Integer> number = new ArrayList<>();
                number.add(n);
                System.out.println(number);
                if (n % 2 == 0) {
                    System.out.println(number + " is an even number!");
                } else {
                    System.out.println(number + " is an odd number!");
                }

                break;
            case 2:// prime or not
                ArrayList<Integer> number1 = new ArrayList<>();
                System.out.print("Enter the value of n:");
                n = sc.nextInt();
                number1.add(n); // Added n in the Array list!
                int count = 0;
                int i;

                for (i = 1; i <= n; ++i) {
                    if (n % i == 0) {
                        count++;
                    }

                }
                if (count == 2) {
                    System.out.println(number1 + " is  prime number!");
                } else {
                    System.out.println(number1 + " is not prime number!");
                }
                break;

            case 3:// palindrome or not
                int num, r, temp;
                ArrayList<Integer> number2 = new ArrayList<>();
                int sum = 0;
                System.out.println("Enter the number to check Weather it is palindrome or not:");
                num = sc.nextInt();
                number2.add(num);

                temp = num;

                while (num != 0) {
                    r = num % 10;
                    sum = (sum * 10) + r;
                    num = num / 10;
                }

                if (temp == sum) {
                    System.out.println(number2 + " is a palindrome number!");
                } else {
                    System.out.println(number2 + " is not a palindrome Number!");
                }
                break;

            default:
                break;
        }
    }

}