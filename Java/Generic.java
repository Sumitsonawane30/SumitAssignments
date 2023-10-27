import java.util.Objects;

public class Generic{
    public static <T> void Palindrome(T s){
        String s1=(String)s;
        StringBuffer s2=new StringBuffer(s1);
        String ss=new String(s2.reverse());
        if(Objects.equals(s1, ss))	
			System.out.println(s+" is Pallindrome");
		else
			System.out.println(s+" is not Pallindrome");     

    }
    public static void main(String[] args) {
       

    }

}



