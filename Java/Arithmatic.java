import java.util.Scanner;
public class Arithmatic{
	public static void main(String[]args){
		int num;
		int num1;
		int num2;
		int ans;
		char operator;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		num1 = sc.nextInt();
		System.out.println("Enter num2:");
		num2 = sc.nextInt();
		
		System.out.println("Choose an operator = +,-,* or /");
		operator = sc.next().charAt(0);
		
		switch(operator){
			
			case '+':
				ans=num1+num2;
				System.out.println("Addition is:"+ans);
				break;
				
			case '-':
				ans=num1-num2;
				System.out.println("Subtraction is:"+ans);
				break;
				
			case '*':
				ans=num1*num2;
				System.out.println("multiplication is:"+ans);
				break;
			case '/':
				ans=num1/num2;
				System.out.println("Division is:"+ans);
				break;
				
			default:
				System.out.println("Invalid Operator");
				break;
				
				
		}
		sc.close();
		

		
	
	
	
	}


}
