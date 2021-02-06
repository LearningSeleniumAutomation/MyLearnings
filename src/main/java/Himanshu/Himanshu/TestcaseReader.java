package Himanshu.Himanshu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestcaseReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try  
		{  
		FileReader fr = new FileReader("./Data/TestCase.txt");
		BufferedReader br=new BufferedReader(fr);
		StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
		String line;  
		while((line=br.readLine())!=null)  
		{  
		sb.append(line); //appends line to string buffer
		System.out.println("****************************");
		System.out.println(sb);
		System.out.println("***************************");
		sb.append("\n");     //line feed   
		}  
		fr.close();    //closes the stream and release the resources  
		System.out.println("Contents of File: ");  
		System.out.println(sb.toString());   //returns a string that textually represents the object  
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  
	}

}
