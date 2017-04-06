
/**
 * This finds the zeros of a polynomial function.
 * 
 * @author Suraj Anand 
 * @version (1
 */
import java.util.*;

public class Quadratic
{
    private Scanner scan = new Scanner (System.in);
    private String function;
    private int [] coefficients;
    private ArrayList <Integer> possZeros;
    private ArrayList <Integer>  zeros = new ArrayList <Integer>();
    private int deg;
    /**
     * Constructor for objects of class Quadratic
     */
    public Quadratic(int [] coeff, int d)
    {
        deg = d;
        //function = func;
        coefficients = coeff;
    }
    
    public ArrayList <Integer> getRationalZeros()
    {
        int zeroCheck = 0;
        getPossZeros();
        int num1, num2;
        for (int i = 0; i < possZeros.size(); i ++ )
        {
            zeroCheck = possZeros.get(i);
            if (seeIfZero(zeroCheck))
            {
                zeros.add(zeroCheck);
                i++;
            }
        }
        for (int j = 0; j < zeros.size(); j ++ )
        {
            num1 = zeros.get(j);
            for (int k = 0; k < zeros.size(); k ++ )
                {
                 num2 = zeros.get(j);
            
            }
        }
        if (coefficients[deg] == 0)
        {
            zeros.add(0);
        }
        return zeros;
    }
    
    private ArrayList <Integer> getPossZeros ()
    {
        int lc = coefficients[0];
        int con = coefficients[deg];
        int count = deg;
        while (con == 0)
        {
            con = coefficients[count--];
        }
        ArrayList <Integer> factorsLc = getFactors(lc);
        ArrayList <Integer> factorsCon = getFactors(con);
        
         possZeros = new ArrayList <Integer>(factorsLc.size() * factorsCon.size() );
        int p;
        int q;
        
        for (int i = 0; i < factorsCon.size(); i ++ )
        {
            p = factorsCon.get(i);
            for (int j = 0; j < factorsLc.size(); j +=2)
            {
                q = factorsLc.get(j);
                possZeros.add(p/q);
            }
        }
        return possZeros;
    }
    
    public boolean seeIfZero(int zero)
    {
        boolean zeroT = false;
        int total = 0;
        int added = 0;
        for (int i = 0; i < coefficients.length; i ++)
        {
            if (i == 0)
                total = coefficients[0];
            else
            {
                total = coefficients[i] + added;
            }
            added = total * zero;
        }
        if (total == 0)
        {
            zeroT = true;
        }
        return zeroT;
    }
    
        private ArrayList <Integer> getFactors(int numToFac)
    {
        ArrayList <Integer>  factors = new ArrayList <Integer>();
        if (numToFac >= 0)
        {
            for (int i = 1; i <= numToFac; i ++)
            {
                if (numToFac % i == 0 || numToFac % -i == 0)
                {
                    factors.add(i);
                    factors.add(i * -1);
                }
            }
        }
        else if (numToFac <= 0)
        {
            for (int i = -1; i >= numToFac; i --)
            {
                if (numToFac % i == 0 || numToFac % -i == 0)
                {
                    factors.add(i);
                    factors.add(i * -1);
                }
            }
        }
        
        return factors;
    }
}
