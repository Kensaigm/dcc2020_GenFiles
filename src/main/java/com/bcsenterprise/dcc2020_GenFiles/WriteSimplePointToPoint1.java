
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
        JSONArray ja = new JSONArray();
        
        JSONObject jo1 = new JSONObject();
        
        JSONArray ja1 = new JSONArray();
        ja1.add("Position");
        ja1.add("X");
        ja1.add(100);
        ja1.add("Y");
        ja1.add(100);
        
        jo1.put(ManagerEnum.MSE, ja1);
        
        
        JSONObject jo2 = new JSONObject();
        
        JSONArray ja2 = new JSONArray();
        ja2.add("Position");
        ja2.add("X");
        ja2.add(200);
        ja2.add("Y");
        ja2.add(200);
        
        jo2.put(ManagerEnum.MSE, ja2);
        
        ja.add(jo1);

        ja.add(jo2);
        
        
        try (FileWriter fw = new FileWriter("SimplePointToPoint.json")){
            fw.write(ja.toJSONString());
        } catch (IOException ex) {
            Logger.getLogger(WriteSimplePointToPoint1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
