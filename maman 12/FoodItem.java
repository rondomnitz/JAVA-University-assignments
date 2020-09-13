/**
* Using a class to represent a given food item object.
*
* @Ron Domnitz - 203217286
* @ 12/12/2019
*/
public class FoodItem
{
    // instance variables
    private  String _name; //immutable variables
    private  long _catalogueNumber; //immutable variables
    private   int  _minTemperature, _maxTemperature; //immutable variables
    private int _quantity, _price;
    private Date _expiryDate, _productionDate;
    private final int DEFAULT_QUANTITY=0,
                      DEFAULT_VAL=0,
                      DEFAULT_PRICE=1,
                      MIN_CATALOGUENUMBER=999,
                      MAX_CATALOGUENUMBER=10000,
                      DEFAULT_CATALOGUENUMBER=9999;
    //constructors:
    /**
    * Constructor for objects of class FoodItem
    * creates a new FoodItem object
    * @param name - name of food item
    *        catalogueNumber - catalogue number of food item
    *        quantity - quantity of food item
    *        productionDate - production date
    *        expiryDate - expiry date
    *        minTemperature - minimum storage temperature
    *        maxTemperature - maximum storage temperature
    *        price - unit price
    */
    public FoodItem(String name,
                    long catalogueNumber,
                    int quantity,
                    Date productionDate,
                    Date expiryDate,
                    int minTemperature,
                    int maxTemperature,
                    int price)
    {    
        if (name.equals("")) // Condition if there is no name
            _name = "item"; //Default name
        else  
            _name = name;
            
        if (catalogueNumber > MIN_CATALOGUENUMBER && catalogueNumber < MAX_CATALOGUENUMBER) // Condition for 4 (1000-9999) digit
            _catalogueNumber = catalogueNumber;
        else
            _catalogueNumber= DEFAULT_CATALOGUENUMBER; //9999
       
        if(quantity<0) //Condition for positive number (include zero) 
            _quantity = DEFAULT_QUANTITY; //==0
        else
            _quantity = quantity;
           
        if (price<=0) //Condition for positive number
            _price = DEFAULT_PRICE;//==1
        else 
            _price = price;   
            
        if(new Date(expiryDate).before(new Date(productionDate))) // Using the "before" method from Date class
        {
            _expiryDate = new Date(productionDate).tomorrow();
            _productionDate = new Date(productionDate);
        }
        else
        {
            _expiryDate = new Date (expiryDate); 
            _productionDate = new Date (productionDate);
        }
        
        if(minTemperature > maxTemperature) //Condition for temperature (max>min)
        {   //Replace
            _minTemperature = maxTemperature;
            _maxTemperature = minTemperature;
        }  
        else
        {  //As is
            _minTemperature = minTemperature;
            _maxTemperature = maxTemperature;
        }
    }
    
    /**
    * Copy Constructor
    * @param other - the food item to be copied
    */
    public FoodItem(FoodItem other)
    {   
      _name = other._name;
      _catalogueNumber = other._catalogueNumber;
      _quantity = other._quantity;  
      _productionDate = new Date(other._productionDate);
      _expiryDate = new Date(other._expiryDate);
      _minTemperature = other._minTemperature;
      _maxTemperature = other._maxTemperature;
      _price = other._price;    
    }
    
    /**
    * check if 2 food items are the same (excluding the quantity values)
    * @param other - the food item to compare this food item to
    * @returns true if the food items are the same
    */
    public boolean equals(FoodItem other)
    {  // Equals method - return true if all the attributes equals (except from quantity)
      if(_name.equals(other._name) && _catalogueNumber == other._catalogueNumber && _price == other._price 
      && _expiryDate.equals(other._expiryDate) && _productionDate.equals(other._productionDate)
      && _minTemperature == other._minTemperature && _maxTemperature == other._maxTemperature)
             return true;
      return false; 
    }
    
    /**
    * gets the catalogue number
    * @returns the catalogue number
    */
    public long getCatalogueNumber() 
    {  
        return _catalogueNumber;
    }
 
    /**
    * gets the expiry date
    * @returns the expiry date
    */
    public Date getExpiryDate() 
    {
        return new Date (_expiryDate);
    }
    
    /**
    * gets the maximum storage temperature
    * @returns the maximum storage temperatur
    */
    public int getMaxTemperature() 
    {
        return  _maxTemperature;
    }
  
    /**
    * gets the minimum storage temperature
    * @returns the minimum storage temperatur
    */
    public int getMinTemperature() 
    {
        return _minTemperature; 
    } 
   
    /** gets the name
    * @return the name
    */         
    public String getName() 
    {
        return new String (_name);
    }
   
    /** gets the unit price
    * @return the unit price
    */ 
    public int getPrice()   
    {
        return _price;
    }
    
    /** gets the production date
    * @return the production date
    */ 
    public Date getProductionDate() 
    {
        return new Date (_productionDate);
    }
    
    /** gets the quantity
    * @return the quantity
    */
    public int getQuantity() 
    {
        return _quantity;
    }
    
    /**
    * returns the number of units of products that can be purchased for a given amount
    * @param amount - amount to purchase
    * @returns the number of units can be purchased
    */
    public int howManyItems (int amount)
    {   
        if(amount>DEFAULT_VAL) //==0
        {
            if (_price*_quantity<=amount)
                 return _quantity;
            return (amount/_price) ;   
        }
        return DEFAULT_VAL; //==0
        }
        
    /**
    * check if this food item is cheaper than other food item
    * @param other - food item to compare this food item to
    * @returns true if this food item is cheaper than other date
    */
    public boolean isCheaper (FoodItem other)
    {
        if(_price < other._price)
             return true;
        return false;
    }
  
    /**
    * check if this food item is fresh on the date d
    * @param d - date to check
    * @returns true if this food item is fresh on the date d
    */
    public boolean isFresh (Date d) //Use the again and before method's from Date class
    {
        if (d.before(_expiryDate) && d.after(_productionDate) || d.equals(_expiryDate) || d.equals((_productionDate)))
              return true;
        return false;   
    }
    
    /**
    * check if this food item is older than other food item
    * @param other - food item to compare this food item to
    * @returns true if this food item is older than other date
    */
    public boolean olderFoodItem (FoodItem other) //Use the before method from Date class
    {
        if(_productionDate.before(other._productionDate))  
              return true;
        return false;   
    }
    
    /**
    * set the expiry date (only if not before production date )
    * @param d - expiry date value to be set
    */
    public void setExpiryDate(Date d) //Use the after method from Date class
    {
        if(new Date(d).after(_productionDate) || _productionDate.equals((new Date(d))))
        _expiryDate =  new Date (d);
    }
    
    /**
    * set the price (only if positive)
    * @param n - price value to be set
    */
    public void setPrice(int n)
    {
      if (n>DEFAULT_VAL) //==0
           _price = n;
    }
  
    /**
    * set the production date (only if not after expiry date )
    * @param d - production date value to be set
    */
    public void setProductionDate (Date d) //Use the after method from Date class
    {   if(_expiryDate.after(new Date(d)) || _expiryDate.equals((new Date(d))))
            _productionDate =  new Date (d);
    }
    
    /**
    * set the quantity (only if not negative)
    * @param n - the quantity value to be set
    */
    public void setQuantity (int n)
    {
      if(n>=DEFAULT_VAL) 
           _quantity = n;
    }
    
    /** returns a String that represents this food item
    * @returns String that represents this food item in the following format:
    * FoodItem: milk CatalogueNumber: 1234 ProductionDate: 14/12/2019 ExpiryDate: 21/12/2019 Quantity: 3
    */
    public String toString()
    {   
        return ("FoodItem: " +_name + "\tCatalogueNumber: " + _catalogueNumber + "\tProductionDate: " + _productionDate +
        "\tExpiryDate: " + _expiryDate + "\tQuantity: " + _quantity);
    }
}

                    