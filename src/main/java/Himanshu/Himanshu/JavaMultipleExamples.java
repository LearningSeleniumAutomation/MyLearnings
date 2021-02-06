package Himanshu.Himanshu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.TreeMap;

public class JavaMultipleExamples {

Scanner sc =null;	
	JavaMultipleExamples()
	{
		//This super call is to Object class 
		super();
	}
	
	
	//1. Mehthod to Take userInput
	
	void userInput()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter some Number");
		int num = sc.nextInt();
		System.out.println("number Entered is : " +num);
	}
	
	
	 public static TreeMap<String, String> getProperties(String infile) throws IOException {
	        final int lhs = 0;
	        final int rhs = 1;

	        TreeMap<String, String> map = new TreeMap<String, String>();
	        BufferedReader  bfr = new BufferedReader(new FileReader("./Data/TestCase.txt"));

	        String line;
	        while ((line = bfr.readLine()) != null) {
	            if (!line.startsWith("#") && !line.isEmpty()) {
	                String[] pair = line.trim().split("=");
	                map.put(pair[lhs].trim(), pair[rhs].trim());
	            }
	        }

	        bfr.close();

	        return(map);
	    }
	
	
	public static void main(String[] args) throws IOException {
		 try {
	           TreeMap<String, String> map = getProperties("./sample.properties");
	           System.out.println(map);
	        }
	        catch (IOException e) {
	            // error using the file
	        }
	}

}
