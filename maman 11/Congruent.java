/**
 * This programm get six pairs from the user and calculates the length and if the triangles are congruent.
 *
 * @Ron Domnitz - 203217286
 * @24/11/2019
 */
import java.util.Scanner; //import declaration for using ths Scanner class
public class Congruent //start of class Congruent
{
   public static void main (String [] args) //start of method main
   {
        Scanner scan = new Scanner (System.in);  //creating a Scanner object for interaction
        //declaration    
        double D1, D2, D3, d1, d2, d3, X1 ,Y1, X2, Y2, X3, Y3, x1, y1, x2, y2, x3, y3;
        
        System.out.println("Please enter six pairs of points (two triangle):");
        //getting data from user 
        X1 = scan.nextDouble(); Y1 = scan.nextDouble();
        X2 = scan.nextDouble(); Y2 = scan.nextDouble();
        X3 = scan.nextDouble(); Y3 = scan.nextDouble();
        x1 = scan.nextDouble(); y1 = scan.nextDouble();
        x2 = scan.nextDouble(); y2 = scan.nextDouble();
        x3 = scan.nextDouble(); y3 = scan.nextDouble();
 
        //calculation section (for lengths)
        D1 = (X1-X2)*(X1-X2)+(Y1-Y2)*(Y1-Y2);
        Math.sqrt(D1);
        
        D2 = (X3-X1)*(X3-X1)+(Y3-Y1)*(Y3-Y1);
        Math.sqrt(D2);  
        
        D3 = (X3-X2)*(X3-X2)+(Y3-Y2)*(Y3-Y2);
        Math.sqrt(D3);
        
        d1 = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        Math.sqrt(d1);
        
        d2 =(x3-x1)*(x3-x1)+(y3-y1)*(y3-y1);
        Math.sqrt(d2);
        
        d3 = (x3-x2)*(x3-x2)+(y3-y2)*(y3-y2);
        Math.sqrt(d3);
        
        System.out.println("The first triangle is (" +X1+ "," +Y1+ ")" + " (" +X2+ "," +Y2+ ")" + " (" +X3+ "," +Y3+ ").");
        System.out.println("The length are " +D1+ ", " +D2+", " + D3 + ".");
        
        System.out.println("The second triangle is (" +x1+ "," +y1+ ")" + " (" +x2+ "," +y2+ ")" + " (" +x3+ "," +y3+ ").");
        System.out.println("The length are " +d1+ ", " +d2+", " + d3 + ".");
        //declaration 
        boolean ifCongruentEquels;
        //condition for checking if the triangles equels
        if(D1 == d1 && D2 == d2 && D3==d3)
            ifCongruentEquels = true;
        else if (D1 == d1 &&  D2 == d3 && D3 == d2)
            ifCongruentEquels= true;
        else if (D1 == d2 && D2 == d1 && D3 == d3)
            ifCongruentEquels = true;
        else if (D1 == d2 && D2 == d3 && D3 == d2)
            ifCongruentEquels = true;
        else if (D1 == d3 && D2 == d2 && D3 == d1)
            ifCongruentEquels = true;
        else if (D1 == d3 && D2 == d1 && D3 == d2)
            ifCongruentEquels = true;
        else
            ifCongruentEquels = false;
        
        if(ifCongruentEquels) // Condition and print the result 
               System.out.println("the triangles are congruent.");
        else
               System.out.println("the triangles are not congruent.");
   }  //end of method main
} //end of class Triangle