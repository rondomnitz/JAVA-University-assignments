/**
* Using a class to represent a stock that can contain foodItem's object
*
* @Ron Domnitz - 203217286
* @28/12/19
*/
public class Stock
{
   // instance variables 
   private FoodItem[]_stock; //an array
   private int _noOfItems;
   private final int MAX_STOCK=100;
            
   /**
   * Constructor for objects of class Stock
   */
   public Stock()
   {
       // initialise instance variables
       _stock = new FoodItem[MAX_STOCK];// 100
       _noOfItems = 0;
   }       
   /**
   * gets the nunmber of items in the stock
   * @return number of items
   */
   public int getNumOfItems()
   {    
       return _noOfItems;
   }        
   /**
   * add a food item to the stock
   * If the item already exist, the quntity will change
   * @return true if succeeded
   */
   public boolean addItem(FoodItem newItem)
   {            
       if(_noOfItems==0) ////condition for first item
       {
            _stock[0]=new FoodItem (newItem);  
            _noOfItems++;
            return true; 
       }
       for (int i=0; i<_noOfItems;i++)
       {
            if(_stock[i].getName().equals(newItem.getName()) && 
                _stock[i].getCatalogueNumber() == newItem.getCatalogueNumber() && 
                _stock[i].getExpiryDate().equals(newItem.getExpiryDate()) && 
                _stock[i].getProductionDate().equals(newItem.getProductionDate())) // condition for the same item
            {
                _stock[i].setQuantity(_stock[i].getQuantity() + (newItem).getQuantity()); // addition the newItem's quntity to the 
                return true; //                                                                                          food item
            }              
       }       
       if(_noOfItems==MAX_STOCK)      //condition for full stock 
                return false;       
       for(int i=0; i<_noOfItems;i++) 
       {
            if((_stock[i].getName().equals(newItem.getName()) && 
               _stock[i].getCatalogueNumber() == newItem.getCatalogueNumber()&& (
               !(_stock[i].getExpiryDate().equals(newItem.getExpiryDate())) ||
               !(_stock[i].getProductionDate().equals(newItem.getProductionDate())) //condition for not the same item  
               )
               ||
               (_stock[i].getCatalogueNumber() > newItem.getCatalogueNumber()))) //condition for arrange the stock in order   
            {
                    _stock[_noOfItems] = new FoodItem (newItem); //insert the new item
                    _noOfItems++;
                    for(int j=_noOfItems; j-1>i ;j--) //loop for move the items one step forward
                    {
                       _stock[j-1]=_stock[j-2]; 
                       if (j-1==i+1) // condition for find the place to put the item
                       {
                            _stock[i] = newItem;
                            return true;                            
                       }  
                    }
            }
            if(_noOfItems-1==i) //for the last item in the stock
            {
                _stock[_noOfItems] = new FoodItem (newItem);
                _noOfItems++;
                return true;
            }
       }
       return false; 
   } 
   /**
   * print a list of item's that we need to order
   * @param amount - order all the items that have quntity below this amount
   * @return a list string of the items
   */  
   public String order(int amount)
   { 
      int sum=0;
      String res = "";
      int i,j;
      for(i=0,j=0 ; i<_noOfItems; i++)
      {
            sum = _stock[i].getQuantity();
            for (int k=i+1; k<_noOfItems; k++)
            {
               if(_stock[i].getName().equals(_stock[k].getName()) && (_stock[i].getCatalogueNumber()==_stock[k].getCatalogueNumber()))
               {   //condition for sum all the quantity of the same item
                   sum+= _stock[k].getQuantity();
                   i++;
               }         
            }
            if(sum<amount && j!=0) //condition for the putting comma after the first item print (,)
            {
                res += ", " + _stock[i].getName();                
            }
            else if
            (sum<amount && j==0)
            {
                res =  _stock[i].getName();
                j++;
            }            
      }
      return res;     
   }          
   /**
   * This method calculate how many food items you can store according to the temperature
   * @param - this is the temperature of the refrigerator
   * @return how many food items can store int the refrigerator
   */ 
   public int howMany (int temp)
   {
        int qauntity=0;         
        for (int i=0; i<_noOfItems; i++)
        {
             if(_stock[i].getMaxTemperature()>=temp && _stock[i].getMinTemperature()<=temp) //condition for find how many items
                   qauntity+=_stock[i].getQuantity();                       //can store depends the max and min temperature
        }
        return  qauntity;           
   }
   /**
   * This method remove all the old food items from the store
   * @param - Date - from theis date and everything that comes befor it
   */      
   public void removeAfterDate(Date d)
   {
        for (int i=0; i<_noOfItems;i++) 
        {   
            if(_stock[i].getExpiryDate().before(d)) //found the item to be removed
            {
               for(int j=i; j<_noOfItems-1; j++)  //move the rest of the items one step back
               {                                
                    _stock[j]=_stock[j+1];   
               }         
               _stock[_noOfItems-1]=null; //remove tha last items
               _noOfItems--;
               i--;
            }
        }
   }
   /**
   * This method calculate the most expensive item in the store
   * @return the most expensive item
   */  
   public FoodItem mostExpensive()
   {
        if(_noOfItems==0) //conditon for an empty stock
            return null;
        FoodItem expensive = new FoodItem(_stock[0]); // the first item is the most expansive (only for now)
             for (int i=1; i<_noOfItems; i++) // i=1 = because we already modified the first item as expensive    
                    if(_stock[i].getPrice() > expensive.getPrice())
                    expensive = _stock[i];
        return new FoodItem (expensive); //return copy  of the Item!
   }
   /**
   * This method calculate how many items (quantity) you have in the store
   * @return how many pieces in the store
   */  
   public int howManyPieces()
   {
       if(_noOfItems==0) //conditon for an empty stock
            return 0;    
            
       int howManyPieces=0;     
       for (int i=0; i<_noOfItems; i++)
          howManyPieces += _stock[i].getQuantity();
       
       return howManyPieces;
   }
   /**
   * This method prints the food items int the store as a string
   * @return string food items
   */       
   public String toString()
   {
       String res = "";
       for (int i=0; i<_noOfItems; i++)  
            res+= _stock[i] + "\n";
       return res;     
   }
   /**
   * This method update the list after sale of some items
   * @param - an string array items list that represent the items that sold
   */  
   public void updateStock (String[] itemsList)
   {    
      for(int i=0;  i<itemsList.length; i++)
      {
            for(int j=0;  j<_noOfItems; j++)    
            {    
                    if(itemsList[i].equals(_stock[j].getName())) //condition for the same item
                    {
                        _stock[j].setQuantity((_stock[j].getQuantity()-1));  // one less in the quantity  
                        if(_stock[j].getQuantity() == 0)
                        {      
                             for(int k=j; k<_noOfItems-1; k++) //moves the items one step back  
                             {
                                  _stock[k] = _stock[k+1];
                             }   
                             _stock[_noOfItems-1] = null; //remove tha last items
                             _noOfItems--;
                             j--;                         
                        }
                        break;    
                    }
            }
      }          
   }
   /**
   * This method calculate which temperature need the refrigerator to be according to the items
   * @return the minmum temperature that need for the items
   */   
   public int getTempOfStock()       
   {
        if(_noOfItems==0) //condition for an empty store
        return  Integer.MAX_VALUE;
        
        int tempMax=Integer.MAX_VALUE, tempMin=0; //decleration
        for(int i=0;  i<_noOfItems; i++)
        {
            if (_stock[i].getMinTemperature()>tempMin)     
                    tempMin = _stock[i].getMinTemperature();
            if (_stock[i].getMaxTemperature()<tempMax)      
                    tempMax = _stock[i].getMaxTemperature();
        }
        if(tempMax >= tempMin)
                return tempMin;
        return Integer.MAX_VALUE;
   }
}//end of class Stock