/**
* This programm get three lengths from the user and calculates the permiter and the area.
* Finally,the programm prints the claculation on the screen.
*
* @Ron Domnitz - 203217286
* @24/11/2019 
*/
import java.util.Scanner; //import declaration for using ths Scanner class
public class Triangle //start of class Triangle
{
    public static void main (String[] args) // start of method main
    {
            Scanner scan = new Scanner (System.in); //creating a Scanner object for interaction
            
            System.out.println ("This program calculates the area "
                + "and the permiter fo a given triangle. ");
            System.out.println ("Please enter the three lengths"
                + " of the triangle's sides");
            //declaration and getting data from user    
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            
            if(a<=0 || b<=0 || c<=0) //condition for getting only positive numbers from the user
  
                  System.out.println("Error, please enter only positive numbers");
                
            else if(a+b>c && b+c>a && a+c>b) //condition for getting only valid lengths of the triangle's sides
            { 
                  //declaration and calculation section
                  int permiter = a + b + c;
                  double s = (double)permiter/2;
                  double area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
                  System.out.println("The permiter is " +permiter + " and the area"+
                  " is "+ area);
            }
            else 
            {
                  System.out.println("Note:");
                  System.out.println("The sum of the length of any two" +
                  " sides must be greater than the length of the remaining "+
                  " side, please select other lengths.");
            } // end else
    }  //end of method main
}//end of class Triangle
