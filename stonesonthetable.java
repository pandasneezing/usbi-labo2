/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrimexico1
 */
      import java.util.*;
import java.lang.*;
import java.io.*;
public class stonesonthetable {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
  

	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		// Counters
		int counter = 0;
		char last = s.charAt(0);

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == last) counter++;
			else last = s.charAt(i);
		}

		// Output
		System.out.println(counter);
	}	
}
    
    

