/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package props;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pascalfares
 */
public class Props {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Read system properties
        Properties sprop = System.getProperties();
        
        String propFile = sprop.getProperty("config.file");
        
        System.out.println("config.file="+propFile);
        
        System.out.println(args[0]+"="+sprop.getProperty(args[0]));
        //Read my own property file
        
        Properties myprop = new Properties();
        try {
            myprop.load(new FileInputStream(propFile));
            System.out.println("aprop="+myprop.getProperty("aprop"));
        } catch (IOException ex) {
            Logger.getLogger(Props.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
