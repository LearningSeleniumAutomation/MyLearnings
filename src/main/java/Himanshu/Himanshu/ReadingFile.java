package Himanshu.Himanshu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	public static String[] words=null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("./Data/TestCase.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		
	while ((line = br.readLine()) != null)
		
		{
			if(line.startsWith("#tc"))
			{
				System.out.println(" Test case is commented ");
			}
			
			else if(line.startsWith("tc") )
			{
				System.out.println("true");
				words = line.split(" ");
				System.out.println(words[1]);
				for(int i =0;i<words.length;i++)
				{
//					if(words[i].contains("api"))
//					{
//						System.out.println(i);
//					}
					if(words[i].startsWith("(|") && words[i].contains("api"))
					{
						System.out.println("hello");
					}
				}
			
			}
		}
	
	//Iterating 
	
	
	}
	

}
