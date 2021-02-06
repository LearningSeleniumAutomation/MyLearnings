package Himanshu.Himanshu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.Attributes.Name;

public class Test875 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="abcabcdabcdef";
		
		
		for(int i=0;i<s.length();i++)
			{
			for(int j=1;j<s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					//System.out.println(s.codePointAt(i));
					//System.out.println(i);
					System.out.println(s.charAt(i));
					
//					System.out.println("*************************");
//					System.out.println(j);
//					System.out.println(s.charAt(j));
				}
			}
			//System.out.println("Substring of "+i +"-->" + s.substring(i));
			//System.out.println(s.charAt(i));
			
			
			
			}
			
		
		
		
	}
	
	

}
