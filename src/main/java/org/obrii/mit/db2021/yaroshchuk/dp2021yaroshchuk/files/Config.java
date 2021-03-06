/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.db2021.yaroshchuk.dp2021yaroshchuk.files;

public class Config {
    
    private static String fileName="";
    
    public static String getFileName(){
    return fileName;
    }
    
    public static void setFileName(String aFileName){
    fileName = aFileName;
    }
}
