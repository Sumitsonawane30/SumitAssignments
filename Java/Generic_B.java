import java.util.*;
public class Generic_B{
    public static void main(String[] args) {

        ArrayList<Integer>Mynumber=new ArrayList<Integer>();
        ArrayList<Integer>even=new ArrayList<Integer>();
        ArrayList<Integer>odd=new ArrayList<Integer>();

        // int n;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a No. to check even or odd:");
        // n=sc.nextInt();
        Mynumber.add(4);
        Mynumber.add(1);
        Mynumber.add(7);
        Mynumber.add(10);

        for(int i=0;i<Mynumber.size();i++){
            if(Mynumber.get(i)%2==0){
                System.out.println(even);
            }
            else{
                System.out.println(odd);
            }
        }
        System.out.println("The No. of Even Numbers are"+even.size());
        System.out.println("The No. of odd Numbers are"+odd.size());
        
    
    }

}
