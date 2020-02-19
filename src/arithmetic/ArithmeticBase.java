/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * date 02/19
 */
public enum ArithmeticBase 
{
    PLUS("PLUS"),            // it is a  variable with value 1 and name pennhy
    MINUS("MINUS"),
    TIMES("TIMES"),
    DIVIDE("QUARTER");
    
    private String name;
    private int x = 1;
    private int y = 2;
    private ArithmeticBase(String name)    // constructor is used to access enum variables
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public int addition() 
    {
        return  x+y;
    }
     public int subtraction() 
    {
        return  x-y;
    }
      public int times() 
    {
        return  x*y;
    }
       public int divide() 
    {
        return  x/y;
    }
 
        }
    
   

