package Hybridframeworks;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataproviderwebshop implements Frameworkconstants
{
	@DataProvider(name="logincred")
	public String testdata() throws IOException
	{
		String value=ReadDatafromproperty.getdatafromproperty(property_path);
		return value;
	}
}
