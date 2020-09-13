/**
 * This is a class named polyNode that represent only one element of Polynom.
 *
 * @Ron Domnitz - 203217286
 * @08/02/2020
 */
public class PolyNode
{   // instance variables
    private int _power;
    private double _coefficient;
    private PolyNode _next;
    private final int DEFAULT=0;
    // 3 Constructor:
    /**
     * First Constructor for objects of class PolyNode
     */
    public PolyNode(int power, double coefficient)
    {        
        if(power<0)
        {
            _power=DEFAULT;
            _coefficient=DEFAULT;
        }
        else
        {
            _power=power;
            _coefficient=coefficient;
        }       
        _next=null;      
    }
    /**
    * Second Constructor for objects of class PolyNode
    */
    public PolyNode(int power, double coefficient,PolyNode next)
    {        
        if(power<0)
        {
            _power=DEFAULT;
            _coefficient=DEFAULT;
        }
        else
        {
            _power=power;
            _coefficient=coefficient;
        }
        _next=next;      
    }
    /**
    * Third Constructor for objects of class PolyNode
    */
    public PolyNode(PolyNode p)
    {
         _power=p._power;
         _coefficient=p._coefficient;
         _next=p._next;
    }
    /**
    * gets the Power of the PolyNode
    * @returns the Power
    */
    public int getPower()
    {
        return _power;
    }
    /**
    * gets the Coefficient of the PolyNode
    * @returns the Coefficient
    */
    public double getCoefficient()
    {
        return _coefficient;
    }
    /**
    * gets the Next PolyNode
    * @returns the Next PolyNode
    */
    public PolyNode getNext()
    {
        return _next;   
    }
    /**
    * set the Power
    * @param power - the power of the PolyNode
    */
    public void setPower(int power)
    {
        if(power>=DEFAULT)
            _power=power;
    }
    /**
    * set the Coefficient
    * @param coefficient - the coefficient of the PolyNode
    */
    public void setCoefficient (double coefficient)
    {
        _coefficient=coefficient; 
    }
    /**
    * set the next PolyNode
    * @param PolyNode next;
    */
    public void setNext(PolyNode next)
    {
        _next=next;
    }
    /**
    * @returns a String that represents a PolyNode 
    */
    public String toString()
    {
       if(_coefficient==DEFAULT)
            return "";
       if(_power==DEFAULT)
            return "" + _coefficient;
       if(_coefficient==1 )
            if (_power==1)
                return "x" ;
            else  
                return "x^"  + _power ;        
       if(_coefficient== -1 )
            if (_power==1)    
                return "-x" ;
            else  
                return "-x^"  + _power ;  
       if(_power ==1)
            return _coefficient + "x";       
       return _coefficient + "x^" + _power;
    }
}//end of class polyNode
