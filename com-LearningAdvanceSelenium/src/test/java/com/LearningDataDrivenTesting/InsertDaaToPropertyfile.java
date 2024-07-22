package com.LearningDataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class InsertDaaToPropertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p=new Properties();
		p.setProperty("url", "https://demowebshop.tricentis.com/");
		p.setProperty("username", "anuragdm01@gmail.com");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/config1.properties");
		p.store(fos, "config1");
		System.out.println("data added into file");

	}

}
