import java.util.Scanner;
public class ReverseString 
{
	public static void main(String[] args) {
    
    		String blogName = "Sumit Sonawane";
    		String reversedString = "";
    
    		for(int i = blogName.length()-1; i>=0; i--)
    		{
      			reversedString = reversedString + blogName.charAt(i);
    		}
    
    			System.out.print("The reversed string of the '"+blogName+"' is: " );
    			System.out.println(reversedString);
  	}
}

