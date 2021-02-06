package Himanshu.Himanshu;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Name
		 * Roll Number
		
		 * 
		 */
		
		
		int[][] students = new int[4][4];
		Scanner value = new Scanner(System.in);
		
		//students[0][0] = 1;
	
		//feeding the Value
		for(int x=0;x<4;x++)
		{
			for(int y=0;y<4;y++)
			{
				students[x][y]= value.nextInt();
			}
		}
		
		//Printing the value
		
		for(int x=0;x<4;x++)
		{
			System.out.print("|");
			for(int y=0;y<4;y++)
			{
				System.out.print("\t" +students[x][y]);
			}
			System.out.print("|");
			System.out.println();
		}
		
	}

}
