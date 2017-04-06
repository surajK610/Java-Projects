
public class ArithmeticDrive
{
    public static void main (String [] args)
    {
        Arithmetic num1 = new Arithmetic (12);
        Arithmetic num2 = new Arithmetic (4);
        
        System.out.println(num1.add(num2));
        System.out.println(num2.subtract(num1));
    }
}
