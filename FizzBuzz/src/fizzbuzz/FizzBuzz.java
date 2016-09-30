/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Daran Zhao - CHANGE TO YOUR NAME
 * @class AP CSA
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1;
        for(int counter = 0;counter<100;counter++)
        {
        	if(i%3==0)
        	{
        		System.out.print("Fizz");
        	}
        	if(i%5==0)
        	{
        		System.out.print("Buzz");
        	}
        	if(i%3!=0 && i%5!=0)
        	{
        		System.out.print(i);
        	}
        	System.out.println("");
        	i++;
        }
    }
    
}
