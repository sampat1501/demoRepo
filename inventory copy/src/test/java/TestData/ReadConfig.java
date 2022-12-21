package TestData;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()

	{
		File src=new File("/Users/apple/eclipse-workspace/POM Project/FacebookTest/Configurations/readconfig.properties");
		
		try
		{
			FileInputStream fis=new FileInputStream(src);
			 pro=new Properties();
			
			pro.load(fis);
			
		}catch(Exception e)
		
		{
			System.out.println("The Occurred exception is" +e.getMessage());
		}	
	}
	public String getUrl()
	{
		String url=pro.getProperty("baseUrl");
		return url;
	}
	public String getUsername()

	{
		String userName=pro.getProperty("Usname");
		
		return userName;
	}
	public String getPassword()
	{
		String password=pro.getProperty("PassWord");
		return password;
	}
	public String getfirstname()
	{
		String firstname=pro.getProperty("firstName");
		return firstname;
	}
	public String getlastName()
	{
		String lastname=pro.getProperty("lastName");
		return lastname;
	}
	public String passkey()
	{
		String passKey=pro.getProperty("PassKey");
		return passKey;
	}
	
}
