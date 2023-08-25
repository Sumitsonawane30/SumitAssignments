import java.util.Scanner;
public class Primecheck{
	public static void main(String[]args){
		int num;
		int rem;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check weather it is prime or not:");
		num=sc.nextInt();
		
		i = 1;
		rem=num % i;
		
		if(rem==0){
			System.out.println(num+"is a Prime No.");
		}
		else{
			System.out.println(num+"is not a prime No.");
		}
	
	
	}


}
