/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suren.wse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author suren
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           String link= "http://www-cdn.oneindia.com/img/2016/06/euro16-logo-600-04-1465022413.jpg";
            URL url= new URL(link);
            URLConnection conn = url.openConnection();
            String[] data= link.split("/");
            FileOutputStream os= new FileOutputStream(data[data.length-1]);
//       FileOutputStream os = new FileOutputStream(data[data.length-1]);
            
            InputStream is=conn.getInputStream();
            byte[] byt= new byte[1024];
            int i=0;
             while ((i= is.read(byt))!=1){
                 
                 os.write(byt, 0, i);
               
             }
             System.out.println("code come here ");
             is.close();
             System.out.println(link + "is downloading ");
            os.close();
            
            
            
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    
    }
    
}
