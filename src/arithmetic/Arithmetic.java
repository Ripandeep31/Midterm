/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * date 02/19
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        
      ArithmeticBase c1 =ArithmeticBase.PLUS;
      ArithmeticBase c2 =ArithmeticBase.MINUS;       
      ArithmeticBase c3 =ArithmeticBase.TIMES;
      ArithmeticBase c4 =ArithmeticBase.DIVIDE;
      
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiply, 4 for divide");
        System.out.println("enter number between 1 and 4");
        int s= sc.nextInt();
        switch (s) 
        {
            case 1:
                System.out.println(c1.addition());
                break;
            case 2:
                System.out.println(c2.subtraction());
                break;
            case 3:
                System.out.println(c3.times());
                break;
            case 4:
                System.out.println(c4.divide());
                break;
            default:
                System.out.println("Invaild Choice");
                
    
    }



    }

}

