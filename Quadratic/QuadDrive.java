import java.util.*;
public class QuadDrive
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        int deg;
        
        ArrayList <Integer> zeros;
        
        System.out.println("What degree is you function?");
        deg = scan.nextInt();
        
        int [] coefficients = new int[deg + 1];
        
        System.out.println("What are the coefficients(press enter after each)?");
        for(int i = 0; i < deg + 1; i ++)
        {
            coefficients[i] = scan.nextInt();
        }
        Quadratic quadratic = new Quadratic(coefficients, deg);
        
        zeros = quadratic.getRationalZeros();
        System.out.print("{");
        for (int i = 0; i < zeros.size(); i ++)
        {
            if (i != zeros.size() -1 )
                System.out.print(zeros.get(i) + ", ");
            else 
                System.out.print(zeros.get(i));
        }
        System.out.print("}");
        }
}
