package com.Utilities;

import java.io.File;

import java.io.FileInputStream;

import java.util.Properties;


public class readConfig {
	
Properties pro;
	

public readConfig() 
{
	File src = new File("./Configurations/config.properties");

	try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	} catch (Exception e) {
		System.out.println("Exception is " + e.getMessage());
	}
}

public String getApplicationURL()
{
	String url=pro.getProperty("BaseUrl");
	return url;
}

public String getUsername()
{
String username=pro.getProperty("Username");
return username;
}

public String getPassword()
{
String password=pro.getProperty("PassWord");
return password;
}

public String getChromePath()
{
String chromepath=pro.getProperty("ChromePath");
return chromepath;
}

public String getEdgePath()
{
String edgepath=pro.getProperty("edgePath");
return edgepath;
}

public String getFirefoxPath()
{
String firefoxpath=pro.getProperty("firefoxpath");
return firefoxpath;
}

}
