package com.zerodha.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	public static Properties getProp(String filePath) {
		Properties prop = new Properties();

		try {
			FileInputStream file = new FileInputStream(filePath);
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop;
	}
}
