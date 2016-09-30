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
     * @param int The number that is being tested
     * @param counter Act as the counter in the for loop
     */
    public static void main(String[] args) {
    	// initialize variables
        int i = 1;
        int counter = 0;
        
        //loop from 1 to 100 to test integers i
        for(counter = 0;counter<100;counter++)
        {
        	//tests 3
        	if(i%3==0)
        	{
        		System.out.print("Fizz");
        	}
        	
        	//then tests 5
        	if(i%5==0)
        	{
        		System.out.print("Buzz");
        	}
        	
        	//if neither work
        	if(i%3!=0 && i%5!=0)
        	{
        		System.out.print(i);
        	}
        	
        	//prints to new line
        	System.out.println("");
        	
        	//increases counter by 1
        	i++;
        }
    }
    
}
