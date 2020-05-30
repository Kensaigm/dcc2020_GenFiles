
package com.bcsenterprise.dcc2020_GenFiles;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 *
 * @author scott
 */
public class WriteJSON {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        // index file
        JSONObject fileDetails = new JSONObject();
        fileDetails.put("key", 1.0);
        fileDetails.put("name", "SimplePointToPoint.json");
        fileDetails.put("enabled", true);
        
        JSONObject fileDetails2 = new JSONObject();
        fileDetails2.put("key", 2.0);
        fileDetails2.put("name", "PercentPointToPoint.json");
        fileDetails2.put("enabled", false);
        
        // Add to List
        JSONArray fileList = new JSONArray();
        fileList.add(fileDetails);
        fileList.add(fileDetails2);
        
        try (FileWriter file = new FileWriter("index.json")){
            
            file.write(fileList.toJSONString());
            file.flush();
            
        } catch (IOException ioe){
            System.out.println("HAL 9000: I'm sorry Dave, I'm afraid I can't do that.");
            ioe.printStackTrace();
        }
        
    }
}
