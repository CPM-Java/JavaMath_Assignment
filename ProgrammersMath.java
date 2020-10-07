
/**
 * Demonstration of simple expressions in java.
 * 
 * @author GrayKnight 
 * @version 8/11/17
 */
public class ProgrammersMath
{
    // nothing unexpected in this method, just helpful info
    public double orderOfOperations()
    {
        //it is possible to initialize many identifiers of the same type in one line.
        double x = 15, y = 4, z = 16, w = 11, r = 0;
        double  q; // If I don't assign an initial value to a number, java defaults its value to zero.
        
        //The order of operations is still PEMDAS from Algebra
        q = (w + y) / x + w * y ;
        
        return q;
    }

    /**
     * What happens when an integer is divided by an integer and stored as an integer?
     * Try several values for x and y, some evenly divisible values and some not.
     * Are there unexpected outcomes?
     * 
     * @param  x   an integer
     * @param  y   an integer
     * @return     the quotient of x and y as an integer
     */
    public int integerDivisionI(int x, int y)
    {
        int z = x / y;
        return z;
    }
    
    /**
     * What happens when an integer is divided by an integer and stored as a double?
     * Try several values for x and y, some evenly divisible values and some not.
     * Are there unexpected outcomes?
     * 
     * @param  x   an integer
     * @param  y   an integer
     * @return     the quotient of x and y as a double
     */
    public double integerDivisionII(int x, int y)
    {
        double z = x / y;
        return z;
    }
    
    /**
     * What happens when a double is divided by an integer and stored as a double?
     * Try several values for x and y, some evenly divisible values and some not.
     * Are there unexpected outcomes?
     * 
     * @param  x   a double
     * @param  y   an integer
     * @return     the quotient of x and y as a double
     */
    public double doubleDivisionI(double x, int y)
    {
        double z = x / y;
        return z;
    }
    
    /**
     * What happens when a double is divided by an integer and cast as an integer?
     * Try several values for x and y, some evenly divisible values and some not.
     * Are there unexpected outcomes?
     * 
     * @param  x   a double
     * @param  y   an integer
     * @return     the quotient of x and y cast as an integer
     */
    public int doubleDivisionII(double x, int y)
    {
        int z = (int) (x / y);   // the (int) is called casting. It is forcing the result to be an integer.
        return z;
    }
    
    /**
     * What happens when an integer is divided by a double and stored as a double?
     * Try several values for x and y, some evenly divisible values and some not.
     * Are there unexpected outcomes?
     * 
     * @param  x   a integer
     * @param  y   a double
     * @return     the quotient of x and y as a double
     */
    public double doubleDivisionIII(int x, double y)
    {
        double z = x / y;
        return z;
    }
    
    /**
     * What happens when a double is divided by a double in an expression and stored as a double?
     * Try several values for x and y, some evenly divisible values and some not.
     * Are there unexpected outcomes?
     * 
     * @param  x   a double
     * @param  y   a double
     * @return     the quotient of x and y as a double
     */
    public double doubleDivisionAsPartOfAnExpression(double x, double y)
    {
        double z = x / y - 0.1;
        return z;
    }
    
    /**
     * The % is called the modulus.
     * Try several values for x and y, some evenly divisible values and some not.
     * What is the modulus calculation doing?
     * 
     * @param  x   an integer
     * @param  y   an integer
     * @return     the modulus of x and y as an integer
     */
    public int modulus(int x, int y)
    {
        int z = x % y;
        return z;
    }
}
