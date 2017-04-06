import java.util.*;

public class Arithmetic
{
    private int number;
    private char operat;
    
    public Arithmetic()
    {
        number = 0;
    }
    
    public Arithmetic(int num)
    {
        number = num;
    }
    
    public Arithmetic(int num, char op)
    {
        number = num;
        operat = op;
    }
    
    public int getNum()
    {
        return number;
    }
    
    public int add(Arithmetic numAdd)
    {
        return number + numAdd.getNum();
    }
    
    public int subtract(Arithmetic numSub)
    {
        return number - numSub.getNum();
    }
}