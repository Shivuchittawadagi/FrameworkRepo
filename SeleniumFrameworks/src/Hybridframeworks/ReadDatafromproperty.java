package Hybridframeworks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDatafromproperty implements Frameworkconstants
{
	public static String getdatafromproperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(property_path);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;	
	}
}
