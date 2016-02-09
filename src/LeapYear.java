/*
 Author: ARozenbaum
 Date:   09-2002
 Revised: 02-2012 (added Scanner class)

 Let the user input a number between 0 & infinity. The number represents the
 year.Let the user input a number between 1 & 12. The number represents the
 month of the year (Jan = 1, Feb = 2, ... , Dec = 12 ).
 Use a switch statement to print whether the year is a leap year or not.
 */

import java.util.Scanner;

public class LeapYear
{
	public static void main(String arg[])
	{
        Scanner console = new Scanner( System.in ) ;
        System.out.println( "Enter the year as an integer: " );
        int year = console.nextInt();
        System.out.println("Enter the month as an integer: ");
        int month = console.nextInt();
        
        
        if (  (month >= 1) && (month <= 12) ) 
        {
        	
           switch (month) 
           {
                case 4:                 
                case 6:                 
                case 9:                 
                case 11:                
                        System.out.printf( "30 days.\n" );
                        break;
                case 2:     						//February
                	boolean leapYear = leapYear(year);
                	if (leapYear == true)
                		System.out.println("It is a leap year.");
                	else
                		System.out.println("It is not a leap year.");
                        break;
                default:
                        System.out.printf( "31 days.\n" );
                        break;
           }    //                      end of switch

        }
        	
    }
	
	public static boolean leapYear (int year)
	{	
		if (year <= 1582)
		{
			if (year % 4 == 0)
				return true;
			else
				return false;
		}
		else if (year > 1582)
		{
			if (year % 4 != 0)
				return false;
			else if ((year % 4 == 0)&&(year % 100 != 0 ))
				return true;
			else if (year % 400 == 0)
				return true;
			else
				return false;
		}
		else
			return false;
		
	}
}