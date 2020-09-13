/**
* Using a class to represent a two-dimensional array of matrix
*
* @Ron Domnitz - 203217286
* @28/12/19
*/
public class Matrix
{
    // instance variables 
    private int _array[][];
    private final int MAX_MATRIX=255;
    //constructors:
    /**
    * Constructs a Matrix from a two-dimensional array; the dimensiona as well as the valus of this
    * Matrix will be the same as the dimension and values of the two-dimensional array
    * @param - two-dimensional array
    */
    public Matrix(int[][] array)
    {
        int lines = array.length;
        int columns = array[0].length;
        _array = new int [lines][columns]; //define array size
        for (int i=0;i<lines;i++)
        {
              for (int j=0;j<columns;j++) 
                   _array[i][j] =  array[i][j];    
        }
    }
    /**
    * Constructs a size1 by size2 Matrix of zeroes
    * @param - size1 represent row and size2 represent column
    */
    public Matrix(int size1,int size2)
    {
       // initialise instance variables
       _array = new int [size1][size2];  
    }    
    /**
    * This method prints the matrix
    * @return string number of the matrix  
    */
    public String toString()
    {
        String res = "";
        for (int i=0;i<_array.length;i++)
        {
            for (int j=0;j<_array[i].length;j++)
            {
                if(j+1!=_array[i].length)
                    res += _array[i][j] + "\t"; //tab spacing
                else
                    res += _array[i][j] + "\n"; //linebreak     
            }
        }
        return res;
    }        
    /**
    * This method make the negative of the matrix
    * @return a new matrix and doesn't change the source 
    */    
    public Matrix makeNegative()
    {       
       int makeNegative[][] = new int [_array.length][_array[0].length];   
       for (int i=0;i<makeNegative.length;i++)
       {
          for (int j=0;j<makeNegative[0].length;j++) 
          {
               makeNegative[i][j] = MAX_MATRIX - (_array[i][j]); // 255-x
          }           
       }
       return new Matrix (makeNegative);
    }
    /**
    * This method turn the matrix to the negative
    * @return a new negative matrix and doesn't change the source 
    */   
    public Matrix imageFilterAverage()
    {
       int sum = 0;
       final int SIDE_SCANTY_MATRIX=2 ,MIDDLE_SCANTY_MATRIX=3, CORNER=4, MIDDLE_ROW=6 ,MIDDLE_MATRIX=9;
       int image[][] = new int [_array.length][_array[0].length];
        
       if(_array.length==1 && _array[0].length==1) //condition for one rectangle/square in the matrix
       {
             image [0][0] = _array[0][0];
             return new Matrix (image);                  
       }
       
       if(_array.length==1 && _array[0].length!=1)  //condition for one line and some columne in the matrix
       {
            for (int i=0;i<_array.length;i++)
            {
                 for (int j=0;j<_array[i].length;j++)
                 {
                     if(j==0)
                     {
                         sum = _array[i][j]+ _array[i][j+1]; 
                         image [i][j]= sum/SIDE_SCANTY_MATRIX; //2
                     }             
                     if(j==_array[0].length-1)
                     {
                         sum = _array[i][j]+ _array[i][j-1]; 
                         image [i][j]= sum/SIDE_SCANTY_MATRIX; //2
                     }
                     if(j!=0 && j!=_array[0].length-1)
                     { 
                         sum = _array[i][j]+ _array[i][j-1] + _array[i][j+1];
                         image [i][j]= sum/MIDDLE_SCANTY_MATRIX; //3
                     }
                 }
            }
            return new Matrix (image); 
       }
  
       if(_array.length!=1 && _array[0].length==1)  //condition for one columne and some row in the matrix
       {
           for (int i=0;i<_array.length;i++)
           {
                 for (int j=0;j<_array[i].length;j++)
                 {
                     if(i==0)
                     {
                         sum = _array[i][j]+ _array[i+1][j]; 
                         image [i][j]= sum/SIDE_SCANTY_MATRIX; //2
                     }  
                     if(i==_array.length-1)
                     {
                         sum = _array[i][j]+ _array[i-1][j]; 
                         image [i][j]= sum/SIDE_SCANTY_MATRIX; //2
                     }
                     if(i!=0 && i!=_array.length-1)
                     { 
                         sum = _array[i][j]+ _array[i-1][j] + _array[i+1][j];
                         image [i][j]= sum/MIDDLE_SCANTY_MATRIX; //3
                     }
                 }
           }
           return new Matrix (image); 
       }
       // now for a regular matrix (at least two on two row and columne)
       for (int i=0;i<_array.length;i++)
       {
               for (int j=0;j<_array[i].length;j++)
               {            
                    if (i==0 && j==0)
                    {
                        sum = _array[i][j]+ _array[i][j+1] + _array[i+1][j] + _array[i+1][j+1];
                        image [i][j] = sum/CORNER; //4
                    }
                    if (i==0 && j==_array[0].length-1)
                    {
                        sum = _array[i][j] + _array[i][j-1] + _array[i+1][j] + _array[i+1][j-1];
                        image [i][j] = sum/CORNER; //4
                    }
                    if (i==_array.length-1 && j==0)
                    {
                        sum = _array[i][j] + _array[i-1][j] + _array[i][j+1] + _array[i-1][j+1];
                        image [i][j] = sum/CORNER;  //4     
                    }
                    if(i==_array.length-1 && j==_array[0].length-1)
                    {   sum = _array[i][j] + _array[i-1][j] + _array[i][j-1] + _array [i-1][j-1];
                        image [i][j] = sum/CORNER; //4
                    }       
                    if(i==0 && j<_array[0].length-1 && j>0)
                    {
                        sum = _array[i][j]+ _array[i][j-1] + _array [i+1][j-1] + _array[i+1][j] + _array[i+1][j+1]
                        + _array[i][j+1];
                        image [i][j] = sum/MIDDLE_ROW; //6
                    }
                    if(i>0 && i<_array.length-1 && j==_array[0].length-1)
                    {
                        sum = _array[i][j]+ _array[i-1][j] + _array [i-1][j-1] + _array[i][j-1] + _array[i+1][j-1]
                        + _array[i+1][j];
                        image [i][j] = sum/MIDDLE_ROW; //6     
                    }
                    if(j==0 && i>0 && i<_array.length-1)
                    {
                        sum = _array[i][j]+ _array[i-1][j] + _array[i-1][j+1] + _array [i][j+1] + _array[i+1][j+1]
                        + _array[i+1][j];
                        image [i][j] = sum/MIDDLE_ROW; //6        
                    }
                    if(i==_array.length-1 && j>0 && j<_array[0].length-1)
                    {
                        sum= _array[i][j]+ _array[i][j-1] + _array[i-1][j-1] + _array [i-1][j] + _array[i-1][j+1]
                        + _array[i][j+1];
                        image [i][j] = sum/MIDDLE_ROW; //6   
                    }
                    
                    if(i>0 && j>0 && j<_array[0].length-1 && i< _array.length-1) 
                    {
                        sum = _array[i][j]+ _array[i-1][j] + _array[i-1][j+1] + _array [i][j+1] + _array[i+1][j+1]
                        + _array[i+1][j] + _array[i+1][j-1]+ _array[i][j-1] + _array[i-1][j-1];
                        image [i][j] = sum/MIDDLE_MATRIX; //9                     
                    }     
                }
       }
       return new Matrix (image);  
    } 
    /**
    * This method rotate the matrix 90 degrees  clockwise
    * @return a new matrix
    */  
    public Matrix rotateClockwise()
    {
       int image[][] = new int [_array[0].length][_array.length];       
       for (int i=0 ; i<_array[0].length ;i++)            
       {
            for (int j=0 ; j<_array.length ;j++)
            {
                    image[i][(_array.length-1)-j] = _array[j][i];
            }
       }
       return new Matrix (image);  
    }
    /**
    * This method rotate the matrix 90 degrees against clockwise
    * @return a new matrix
    */
    public Matrix rotateCounterClockwise()
    {
       int image[][] = new int [_array[0].length][_array.length];    
       for (int i=0 ; i<_array[0].length  ;i++)             
       {
            for (int j=0; j< _array.length ;j++)
            {
                    image[i][j] = _array[j][_array[0].length-1-i];
            }
       }
       return new Matrix (image);  
    }   
}//end of matrix class