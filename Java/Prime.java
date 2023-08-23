import java.util.Scanner;
public class Prime

{
	public static void main(String[]args){
		int i;
		int num=0;
		int rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No.:");
		num = sc.nextInt();
		for(i=1; i<=num; i++)

		{	rem = num%i;
		}
			if(rem==0)
			{
				System.out.println(num+"is a prime no.");
			}
			else
			{
				System.out.println(num+"is not a prime no.");
			}
		
	
	}	




}
