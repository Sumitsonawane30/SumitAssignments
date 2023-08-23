import java.util.Scanner;
public class Evenodd

{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("Enter a No.:");
		num = sc.nextInt();
		
		if(num%2==0){
			System.out.println("No. is Even number");
		}
		else{
			System.out.println("No. is Odd number");
		}
		
	}		
}
