public class MultiCatch {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());

        }
        // EVEN THOUGH EXCEPTION IS AT LAST IT EXECUTES 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
}
