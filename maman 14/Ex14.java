/**
 * This class contains the four answers for Ex14 .
 *
 * @Ron Domnitz - 203217286
 * @30/01/2020
 */
public class Ex14
{
    /**
    * [Q1.1] subStrC():
    * This method clculates how many times the char 'c' exist in the String s    
    * @return int number of SubString that contains only one the char 'c'
    * Time complexity: O(n) (בגלל שעוברים בלולאה אחת על כל המחרוזת) 
    * Place complexity: O(1) (מספר המשתנים קבוע)
    */
    public static int subStrC(String s, char c)
    {
        int counter = 0; // instance variable
        for (int i = 0; i< s.length(); i++) // loop for find how many char 'c' exist in the String
        {
            if (s.charAt(i)==c)
                counter++;              
        }
        if (counter>2)
            return (counter-2);
        return 0;
    }   
    /**
    * [Q1.2] subStrMaxC()
    * @return the maximum int number of SubString the char 'c'
    * Time complexity: O(n) (בגלל שעוברים בלולאה אחת על כל המחרוזת)
    * Place complexity: O(1) (מספר המשתנים קבוע)
    */
    public static int subStrMaxC(String s, char c, int k)
    {
        int counterC = 0;  // instance variable
        int counterWords = 0;  // instance variable
        for (int i = 0; i< s.length(); i++)
        {
            if (s.charAt(i)==c)
            {
                if (counterC>0)
                {
                      counterWords += Math.min(k+1,counterC);      
                }
                counterC++;
            }     
        }
        return counterWords;
    }  
    /**
    * [Q2] zeroDistance() 
    * This method change every value that isn't zero to a value that represent the distance from the closest zero
    * Time complexity: O(n) (2n עוברים פעמיים בלולאה אבל לא מדובר על שתי לולאות מקוננות אלא אחת אחרי השניה ולכן מדובר על) 
    * Place complexity: O(1)  (מספר המשתנים קבוע)
    */ 
    public static void zeroDistance (int [] a)
    { 
       int steps=0; // instance variable 
       for(int i=0; i<a.length; i++) //loop for one way to
       {     
           if (a[steps]!=0 && a[i]==0)
           {  
               a[steps] = i-steps;
               steps++;
               i--;
           }
           
           else if(a[steps]==0 && a[i]!=0)
               a[i] = i-steps;     
           else if(a[i]==0)
               steps=i;                                          
       }
       int newsteps = a.length-1;
       for(int i=a.length-1; i>=0; i--) // loop for the way back
       {          
           if(a[newsteps]==0 && a[i]!=0)
               a[i] = Math.min(a[i],newsteps-i);           
          
           else if(a[i]==0)
               newsteps=i;                                        
       }
    }           
    /**
    * [Q3] isTrans()           
    *  This method clculates if the one String is a type of "Transformation" of another String
    *  @return booelan answers - true or false
    */    
    public static boolean isTrans (String s, String t) //The main method for the user
    {   
        return isTrans(s, t, s.charAt(0));        
    }    
    public static boolean isTrans (String s, String t, char check) //A privat method that has the reqursia
    {     
        if (s.length() == 0) //base case
        {
            if (t.length() == 0)  
                return true;
            else 
                return false;
        }
        else if (t.length() == 0) 
              return false;
              
        if (s.length()== t.length()) //base case
            if  (equalse(s,t))
                return true;
            
        if((s.charAt(0)!=(t.charAt(0)))) //base case
            return false;
        else 
        {
            if(s.length()<=t.length())
            {
                t = delete(t,0);
                s = delete(s,0);
            }
        }
        return isTrans (s.substring(1),t.substring(1),s.charAt(0));  // calling for req
    }    
    private static String delete (String a, int i) //A private method that delete the same char in the String 
    {
        i=a.length();
        if (i>1)
        {
            if(a.charAt(0) == a.charAt(1))
                return delete (a.substring(1),i);
        }
        return a;
    }    
    private static boolean equalse(String s, String t) // A private method that calculate if 2 String equals each other
    { 
       if(s.length()==0 && t.length()==0)
            return true;
       if (s.charAt(0)!=t.charAt(0))  
            return false;
       return  equalse(s.substring(1), t.substring(1));   
    }        
    /**
    * [Q4] countPaths()             
    * This method clculates the number of the route that pass by the value of the index(unit digit and tens digit)
    * @return the numbers of legal routes from mat[0][0] to mat[row][col]
    */ 
    public static int countPaths(int [][] mat) //The main method for the user
    {
        return (countPaths(mat,0,0));   
    }      
    private static int countPaths(int [][] m,int x, int y)  //A privat method that has the reqursia
    {
      if(!(x>=0 && x<m.length && y>=0 && y<m[x].length))  //base case
           return 0;    
      if(x == m.length-1 && y == m[0].length-1 ) //base case
           return 1;                   
      if(m[x][y]==0 && x!= m.length-1 && y != m[0].length-1) //base case
           return 0;
           
      int count=0;
       
      if(m[x][y]/10==m[x][y]%10) 
           count = countPaths(m,x + (m[x][y]/10), y + (m[x][y]%10));
       
      else 
           count = countPaths(m ,x + (m[x][y]/10), y + (m[x][y]%10))
                 + countPaths(m, x+ (m[x][y]%10), y + (m[x][y]/10));       
      return count;
    } 
}//end of Ex14 class