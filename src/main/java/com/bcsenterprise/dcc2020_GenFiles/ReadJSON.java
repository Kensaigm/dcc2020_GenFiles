
package com.bcsenterprise.dcc2020_GenFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author scott
 */
public class ReadJSON {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = new FileReader("index.json")){
            // Read the JSON file
            Object obj = jsonParser.parse(reader);
            
            JSONArray fileList = (JSONArray) obj;
            
            // Iterate over file array
            fileList.forEach(jFile -> parseUserObject((JSONObject) jFile));
        
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
    
    private static void parseUserObject(JSONObject jFile){
        
        // Get File name
        String fName = (String)jFile.get("name").toString();
        System.out.println("File Name:" + fName);
        
        double key = Double.valueOf(jFile.get("key").toString());
        System.out.println("Key:" + key);
        
        boolean enabled = (boolean)jFile.get("enabled");
        System.out.println("Enabled == " + enabled);
        
    }
    
}
