package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogCapture {

	public static void loggenrator(String classname, String msg)
	{
		Logger log=Logger.getLogger(classname);
		PropertyConfigurator.configure("log4j.properties");
		log.info(msg);
}
}