
package com.bcsenterprise.dcc2020_GenFiles;

/**
 *
 * @author scott
 */
public enum ManagerEnum {
    MSE("Mouse"),
    KBRD("Keyboard");
    
    private String manager;
    
    ManagerEnum(String chkManager){
        this.manager = chkManager;
    }
    
    public String getManager(){
        return manager;
    }
}
