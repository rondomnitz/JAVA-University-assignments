/**
* Using a class to represent a given date in the Gregorian Calendar.
*
* @Ron Domnitz - 203217286
* @ 12/12/2019
*/
public class Date
{
  // instance variables
  private int _day, _month, _year;
  private final int JANUARY=1,FEBRUARY=2, MARCH=3, APRIL=4,MAY=5, JUNE=6,
                    JULY=7, AUGUST=8, SEPTEMBER=9,OCTOBER=10, NOVEMBER=11, DECEMBER=12;
  private final int DEFAULT_DAY=1, DEFAULT_MONTH=1, DEFAULT_YEAR=2000, FOR_FORMAT_NUMBER=9;
  private final int FEBRUARY_LEAP_YEAR=29, FEBRUARY_NOT_LEAP_YEAR=28,
                    LEAP_YEAR_CALCULATION_FOUR=4,LEAP_YEAR_CALCULATION_FOUR_HOUNDRED=400,LEAP_YEAR_CALCULATION_ONE_HOUNDRED=100;
  private final int MIN_DAY=1,MAX__DAY=30, MAX_DAY=31, MIN_MONTH=1, MAX_MONTH=12, MIN_YEAR=1000, MAX_YEAR=9999;
        
  //constructors:   
  /**
  * creates a new Date object
  * @param day the day in the month(1-31)
  * @param month the month in the year(1-12)
  * @param year the year (4 digits)
  */
  public Date(int day, int month, int year)
  {
      if(checkDate(day,month,year)) //checkDate is a private method (you can find it the end of this programm)              
      {                             //this method check if tha date is valid.                
          _day = day;
          _month = month;
          _year = year;
      }  
      else
      {
          _day = DEFAULT_DAY; //1
          _month = DEFAULT_MONTH; //1
          _year = DEFAULT_YEAR;  //2000          
      }
  }   
  
  /**
  * Copy Constructor
  * @param date to be copied
  */
  public Date(Date other)
  {   
      _day = other._day;
      _month = other._month;
      _year = other._year;      
  }
  
  /**
  * check if this date is after other date
  * @param other - date to compare this date to
  * @returns true if this date is after other date
  */
  public boolean after(Date other)
  {
        return other.before(this); //use the "before method"
  }
  
  /**
  * check if this date is before other date
  * @param other - date to compare this date to
  * @returns true if this date is before other date
  */
  public boolean before(Date other)
  {
    if (_year < other._year)
        return true;
           if(_year == other._year && _month < other._month)
                return true;
                if (_year == other._year && _month == other._month && _day < other._day)
                    return true;
                
    return false;   //meaning the date isn't before the other date         
  }
  
  /**
  * calculate the day of the week that this date occurs on 0-Saturday 1-Sunday 2-Monday etc.
  * 
  * @returns the day of the week that this date occurs on
  */
  public int dayInWeek()
  {   //Decleration:
      int D,Y,C,M,day; //local variables
      
      if (_month == JANUARY || _month == FEBRUARY) // condition for JANUARY and FEBRUARY - month will be - 13/14
      {                                                                              //    year - one year step back
           M = _month + 12;
           Y = (_year-1)%100;
           D = _day; 
           C = (_year-1)/100; 
      }
      else 
      {
           M = _month;    
           D = _day; 
           Y = _year%100;
           C = _year/100;     
      }
      
      day = (D + (26*(M+1))/10 + Y + Y/4 + C/4 - 2*C) % 7 ; //Formula for find the number of the day in a week
       
      if (day>=MIN_DAY) //==1
             return (day);   
      else 
             return(Math.floorMod (day,7));   //if the number is negative
  }
   
  /**
  * Calculates the difference in days between two dates
  * @param other the date to calculate the difference between
  * @return the number of days between the dates
  */  
  public int difference (Date other) // calculate the days difference between two dates
  {              //    use the  method calculateDate
     return Math.abs(calculateDate(_day,_month,_year) - calculateDate(other._day,other._month,other._year)); 
  }             //    use the abs method for promise to get only positive numbers
  
  /*
  * Computes the day number since the beginning of the Christian counting of years
  * @param 3 paremeter of date to calculate
  * @return the number of days since the beginning of the Christian counting of years
  */  
  private int calculateDate (int day, int month, int year)
  {
           if (month < 3) 
           {   
               year--;         
               month = month + 12; 
           }
           return 365 * year + year/4 - year/100 + year/400 + ((month+1) * 306)/10 + (day - 62);
  }
  
  /**
  * check if 2 dates are the same
  * @param other - the date to compare this date to
  * @return true if the dates are the same
  */  
    public boolean equals(Date other)
  {
      return(_day == other._day && _month == other._month && _year == other._year); //return true only if all the parameters equals
  }   //else, return false
  
  /** gets the Day
  * @return the day
  */ 
  public int getDay()
  {
      return _day;
  }
  
  /** gets the month 
  * @return the month
  */
  public int getMonth()
  {
      return _month;
  }
   
  /** gets the year
  * @return the year
  */ 
  public int getYear()
  {
      return _year;
  }
  
  /** sets the day 
  * @param dayToSet the value to be set
  */
  public void setDay(int dayToSet)
  {
      if ((checkDate(dayToSet,_month,_year))) //Use the privet method checkDate - keep getting only valid date
           _day = dayToSet;    //else the date doesn't change
  }
  
  /** set the month
  * @param monthToSet the value to be set
  */
  public void setMonth(int monthToSet)
  {
      if ((checkDate(_day ,monthToSet, _year))) //Use the privet method checkDate - keep getting only valid date
          _month = monthToSet; //else the date doesn't change
  }
 
  /** sets the year
  * @param yearToSet the value to be set
  */
  public void setYear(int yearToSet)
  {
     if ((checkDate(_day ,_month, yearToSet))) //Use the privet method checkDate - keep getting only valid date
          _year = yearToSet; //else the date doesn't change
  }
  
  /** calculate the date of tomorrow
  * 
  * @returnd the date of tomorrow
  */
  public Date tomorrow() //Note: this method return a new object of Date(!)
  {   
        switch(_month)
        {
              case FEBRUARY: //3 condition for check max day at FEBRUARY
                  
                   if(_year % LEAP_YEAR_CALCULATION_FOUR_HOUNDRED==0) //condition for 29 days in FEBRUARY   
                   {
                        if(_day == FEBRUARY_LEAP_YEAR) // ==29 
                           return new Date (MIN_DAY ,(_month +1), _year); // day == 1, month will be the next month
                             
                        else       
                           return new Date ((_day+1) ,_month, _year); 
                   }    
                            
                   if(_year%LEAP_YEAR_CALCULATION_FOUR == 0 && _year%LEAP_YEAR_CALCULATION_ONE_HOUNDRED == 0 &&
                      _year%LEAP_YEAR_CALCULATION_FOUR_HOUNDRED !=0)  
                   {//condition for 28 days in FEBRUARY
                        if(_day == FEBRUARY_NOT_LEAP_YEAR)  // ==28
                            return new Date (MIN_DAY ,(_month +1), _year); // day == 1, month will be the next month
                           
                        else
                            return new Date ((_day+1) ,_month, _year);
                   }
                        
                   if(_year%LEAP_YEAR_CALCULATION_FOUR == 0 && _year%LEAP_YEAR_CALCULATION_ONE_HOUNDRED!= 0 && 
                      _year%LEAP_YEAR_CALCULATION_FOUR_HOUNDRED !=0) 
                   {//condition for 29 days in FEBRUARY 
                        if (_day == FEBRUARY_LEAP_YEAR) // == 29
                            return new Date (MIN_DAY ,(_month +1), _year);
                             
                        else    
                            return new Date ((_day+1) ,_month, _year);
                   }
                        
                   if (_day == FEBRUARY_NOT_LEAP_YEAR) // == 28 , condition for "regular" FEBRUARY that will be 28 days
                         return new Date (MIN_DAY ,(_month +1), _year);       
                   else
                         return new Date ((_day+1), _month, _year); 
                    
              case APRIL: //these months have 30 days
              case JUNE: 
              case SEPTEMBER: 
              case NOVEMBER:
                  
                    if (_day==MAX__DAY) //==30
                        return new Date (MIN_DAY ,(_month +1), _year);
                    else
                        return new Date ((_day + 1),_month, _year);
                  
              case JANUARY: //these months have 31 days
              case MARCH:
              case MAY:
              case JULY:
              case AUGUST:
              case OCTOBER:
                            
                   if(_day==MAX_DAY) // ==31
                       return new Date (MIN_DAY ,(_month +1), _year);
                              
                   else 
                       return new Date ((_day +1),_month , _year);     
                    
              case DECEMBER: //condition for the last day in the year (31/12/year)
                    
                   if(_day==MAX_DAY) // ==31
                       return new Date (MIN_DAY,MIN_MONTH, (_year +1));
                    
                   else    
                       return new Date ((_day+1), _month, _year); 
                              
        }//end of switch    
        return new Date (DEFAULT_DAY,DEFAULT_MONTH,DEFAULT_YEAR); // The program will not reach to this statment
  }
       
  /**
  * returns a  String that represents this date
  *
  * @return String that represents this date
  * in the following format:
  * day/month/year (02/03/1998)
  */
   public String toString() // This method using the private method below
   {
      return (format(_day)+"/"+format(_month)+"/"+_year);     
   }
   
  /*
  * private method that add 0 (zero) before the number if it's one digit
  * in the following format:
  * day/month/year (02/03/1998)
  */
  private String format(int num) //private method that add 0 (zero) before the number if it's one digit
  {
      if(num>FOR_FORMAT_NUMBER) //=9
            return ""+num;
      else
            return "0"+num; 
  }
  
  private boolean checkDate(int day,int month,int year) //Method private for checking if the date ia valid, 
  {                                                     //otherwise returns default date- 1/1/2000
       if (year >= MIN_YEAR && year <= MAX_YEAR && month >= MIN_MONTH && month <= MAX_MONTH && day >= MIN_DAY && day <= MAX_DAY)
       { //simple condition for valid date - day(1-31), month (1-12), year(4 digiys)   
            switch(month)
            {
                   case APRIL: //these months have 30 days
                   case JUNE: 
                   case SEPTEMBER: 
                   case NOVEMBER:
                            
                        if(day==MAX_DAY) //if they have 31 days in the month - (INVALID!)
                        {
                            return false;   
                        }
                        else
                        {
                            return true;
                        }
                        
                   case FEBRUARY: //this month has 28/29 days depends the year
                       { 
                       
                       if (year%LEAP_YEAR_CALCULATION_FOUR_HOUNDRED==0) //FEBRUARY with 29 days    
                        
                             if (day > FEBRUARY_LEAP_YEAR) // = 29
                             {
                                return false;
                             }
                             else
                             {
                                return true;
                             }                        
                        
                       if(year%LEAP_YEAR_CALCULATION_FOUR == 0 && year%LEAP_YEAR_CALCULATION_ONE_HOUNDRED == 0 &&
                          year%LEAP_YEAR_CALCULATION_FOUR_HOUNDRED !=0)
                       { //FEBRUARY with 28 days
                             if(day > FEBRUARY_NOT_LEAP_YEAR)
                             {
                               return false;
                             }
                             else
                             {
                                return true;
                             }
                       }
                        
                       if(year%LEAP_YEAR_CALCULATION_FOUR == 0 && year%LEAP_YEAR_CALCULATION_ONE_HOUNDRED!= 0 &&
                          year%LEAP_YEAR_CALCULATION_FOUR_HOUNDRED !=0) 
                       {//FEBRUARY with 29 days
                             if (day > FEBRUARY_LEAP_YEAR)
                             {
                                return false;
                             }
                             else
                             {
                               return true; 
                             }
                       }
                        
                       if (day > FEBRUARY_NOT_LEAP_YEAR) // Regular FEBRUARY has 28 days
                            
                            return false;     
                   }             
                   default: return true;
            }//end of switch        
       } //end first if
       return false; //for the first condition - day(1-31), month (1-12), year(4 digiys)   
    }//end of method checkDate 
 }//end of class Date  




      
  



 

