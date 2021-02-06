package Himanshu.Himanshu;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
String UserName;
String Password;

ReadingProperties()
{
	this.UserName=UserName;
	this.Password=Password;
}


	public void ReadingFromProperties() throws IOException
	{
	Properties	prop = new Properties();
	FileReader reader = new FileReader("./Data/Filr.properties");
	prop.load(reader);

	 UserName = prop.getProperty("Filr.User.name");
	Password= prop.getProperty("Filr.User.Password");
	}

	public static void main(String[] args) throws IOException
	{
		ReadingProperties rp = new ReadingProperties();
		rp.ReadingFromProperties();
		System.out.println(rp.UserName);
		System.out.println(rp.Password);
	}
}
