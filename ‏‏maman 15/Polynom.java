/**
 * This is a class named Polynom that represent Polynom using polyNode class.
 *
 * @Ron Domnitz - 203217286
 * @08/02/2020
 */
public class Polynom
{
    // instance variables
    private PolyNode _head;
    /**
    * First Constructor for objects of class Polynom
    */
    public Polynom()
    {
        _head = null;
    }
    /**
    * Second Constructor for objects of class Polynom
    */
    public Polynom(PolyNode p)
    {
        _head =  p;
    }    
    /**
    * gets the Head of the Polynom
    * @returns the Head
    */
    public PolyNode getHead()
    {
       return _head;      
    }   
    /**
    * set the Head of the Polynom
    * @param PolyNode 
    */ 
    public void setHead(PolyNode p) 
    {
        _head = p;           
    }
    /**
    * This method gets parameter of PolyNode and isert the PolyNode in the right place to the sorted Polynom
    * @param PolyNode
    * Time complexity: O(n) - ריצה בלולאה אחד בלבד   
    * Place complexity: O(1)
    */
    public Polynom addNode(PolyNode p)
    {
        if(p.getCoefficient()==0)
           return this;
        if(_head==null)
        {
             _head=p;
             return this;
        }
        if(_head.getPower()<p.getPower())
        {
            p.setNext(_head);
            _head=p;
            return this;
        }
        if(_head.getPower()==p.getPower())
        {
             _head.setCoefficient(_head.getCoefficient()+p.getCoefficient());           
             if(_head.getCoefficient()==0)
                      _head=_head.getNext();       
             return this;    
        }   
        PolyNode temp = _head;
        while(temp.getNext()!=null)
        {
           if(temp.getNext().getPower()<p.getPower())
           {                
              p.setNext(temp.getNext());
              temp.setNext(p);
              return this;                
           }
           if(temp.getNext().getPower()==p.getPower())
           {
               temp.getNext().setCoefficient(temp.getNext().getCoefficient()
               +p.getCoefficient()); 
               if(temp.getNext().getCoefficient()==0)
                    temp.setNext(temp.getNext().getNext()); 
                   
               return this;
           }
           temp=temp.getNext();            
        }  
        temp.setNext(p);
        return this;
    }
    /**
    * This method gets Scalar called 'num' and mult the Polynom by this number
    * @param num
    * Time complexity: O(n) - ריצה בלולאה אחד בלבד   
    * Place complexity: O(1)
    */        
    public Polynom multByScalar (int num)
    {
      PolyNode curr = _head;
      for(curr=_head; curr!=null; curr=curr.getNext())
             curr.setCoefficient(num*curr.getCoefficient());
      return this;    
    }
    /**
    * This method gets Polynom other and add to our current Polynom
    * @param Polynom other
    * Time complexity: O(n) - ריצה בלולאה אחד בלבד על שתי הרשימות וחיבורם לרשימה אחת   
    * Place complexity: O(1)
    */
    public Polynom addPol (Polynom other) 
    {
          if (other==null)
                return this;
          else
          {
                PolyNode p1 = _head; //first 'Pointer'
                PolyNode p2 = other._head; //second 'Pointer'
                PolyNode newPoly = new PolyNode(1,1); //in the end of the method we will delete this Node
                PolyNode p3 =  newPoly; //third 'Pointer'
                
                while(p1!=null || p2!=null)
                {
                    if(p1!=null && p2!=null)
                    {
                        if(p1.getPower()>p2.getPower())
                        {
                            p3.setNext(new PolyNode(p1.getPower(),p1.getCoefficient(),null));
                            p1=p1.getNext();
                        }                  
                        else if(p1.getPower()<p2.getPower()) 
                        {
                            p3.setNext(new PolyNode(p2.getPower(),p2.getCoefficient(),null));
                            p2=p2.getNext();
                        }
                        else if(p1.getPower()==p2.getPower()) 
                        {
                            p3.setNext(new PolyNode(p1.getPower(),p1.getCoefficient() + p2.getCoefficient(),null));
                            p1=p1.getNext();
                            p2=p2.getNext();                   
                        }
                    }
                    else if(p1==null)
                    {
                        p3.setNext(p2);
                        break;
                    }              
                    else if(p2==null)
                    {
                        p3.setNext(p1);
                        break;
                    }           
                    p3 = p3.getNext();
                }
                this._head = newPoly;
                this._head = this._head.getNext(); // delete the first node (1,1);
     
                return this;
          }
    }
    /**
    * This method gets Polynom other and mult to our current Polynom
    * @param Polynom other
    * Time complexity: O(n^2)
    * Place complexity: O(1)
    */
    public Polynom multPol (Polynom other) 
    {       
       if(this==null || this._head== null || other==null || other._head== null)
            return this;
       else
       { 
           PolyNode curr = _head; 
           PolyNode temp = other._head;
           Polynom poly = new Polynom();           
           for(curr=_head; curr!=null; curr=curr.getNext()) 
           {             
             for(temp=other._head; temp!=null; temp=temp.getNext()) 
             {
                poly.addNode(new PolyNode(curr.getPower()+temp.getPower(),curr.getCoefficient()*temp.getCoefficient(),null));
             }               
           }
           this.setHead(poly.getHead());
           return this; 
       }
    }
    /**
    * This method calculates the differential of the Polynom and return the result
    * Time complexity: O(n) - ריצה בלולה אחת
    * Place complexity: O(1)
    */
    public Polynom differential()
    {
       PolyNode curr = _head; 
       while(curr!=null)
       {
              curr.setCoefficient(curr.getCoefficient()*(curr.getPower()));
              curr.setPower(curr.getPower()-1);
              curr=curr.getNext();
       }        
       return this;
    }   
    /**
    * @returns a String that represents a Polynom
    */
    public String toString()
    {
       String res ="";
       PolyNode temp = _head;
       while(temp!=null)
       {
           if(res.equals(""))
                res+= temp.toString();
           else if(temp.getCoefficient()>0)
                res+= "+" + temp.toString();
           else
                res+= temp.toString();
           
           temp = temp.getNext();        
       }
       return res;   
    }
 }//end of class polynome
   
