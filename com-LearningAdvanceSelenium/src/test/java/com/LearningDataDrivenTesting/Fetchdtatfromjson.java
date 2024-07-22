package com.LearningDataDrivenTesting;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchdtatfromjson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("./src/test/resources/jsonFile.json");
		ObjectMapper jsonPath=new ObjectMapper();
		JsonNode data=jsonPath.readTree(file);
		System.out.println(data.get("url").asText());
		System.out.println(data.get("username").asText());
		String url = data.get("url").asText();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		

	}

}
