package com.uddin.filereader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileManager {
	static String basePath = System.getProperty("user.dir");
	static Properties prop;
	static FileInputStream inputFile;
	/**
	 * This method will read the data from Property file, And take the key as a String type parameter 
	 * And return the String value
	 * @param key
	 * @return String value
	 */
	public static String readProData(String key) {
		
		prop = new Properties();
		try {
			inputFile = new FileInputStream(new File(basePath+"/src/main/resources/Property/config.properties"));
			prop.load(inputFile);
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}
		String value = prop.getProperty(key);
		return value;
	}

}
