
package com.bcsenterprise.dcc2020_GenFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 *
 * @author BCS Actual
 */
public class WriteSimplePointToPoint1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        JSONObject jo = new JSONObject();
        jo.put("manager", "mouse");
        
        JSONArray ja = new JSONArray();
        ja.add("X");
        ja.add(100);
        ja.add("Y");
        ja.add(100);
        
        jo.put("Position", ja);
        
        jo.put("manager", "mouse");
        
        
        JSONArray ja2 = new JSONArray();
        ja2.add("X");
        ja2.add(200);
        ja2.add("Y");
        ja2.add(200);
        
        jo.put("Position", ja2);
        
        try (FileWriter fw = new FileWriter("SimplePointToPoint.json")){
            fw.write(jo.toJSONString());
        } catch (IOException ex) {
            Logger.getLogger(WriteSimplePointToPoint1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
