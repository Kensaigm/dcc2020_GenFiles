
package com.bcsenterprise.dcc2020_GenFiles;

import java.io.FileWriter;
import java.io.IOException;

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
        
        try (FileWriter fw = new FileWriter("SimplePointToPoint.json")){
            fw.write(str);
        }
    }
}
