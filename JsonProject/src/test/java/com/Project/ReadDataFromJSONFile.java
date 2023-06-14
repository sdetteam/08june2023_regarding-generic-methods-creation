package com.Project;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadDataFromJSONFile {

	public static void main(String[] args) throws Exception {
		//to parse Json file use parser class
		JSONParser parser = new JSONParser();
		try {     
            Object obj = parser.parse(new FileReader("C:\\Users\\kalwakolu.thulasi\\Desktop\\Thulasi\\JsonProject\\jsonfiles\\employee.json"));

            JSONObject jsonObject =  (JSONObject) obj;

            String username = (String) jsonObject.get("username");
          System.out.println(username);

            String password= (String) jsonObject.get("password");
            System.out.println(password);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
		
	public static String getValueByKey( String key) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("C:\\Users\\kalwakolu.thulasi\\Desktop\\Thulasi\\JsonProject\\jsonfiles\\employee.json"));

        JsonNode valueNode = rootNode.get(key);
        if (valueNode != null) {
            return valueNode.asText();
        }

        return null;
    }
}

	
	
	//public static void getValuewiththekeyfromJson() {
			
			
			
			
			
		
		
	//}

