/**
* 
* @author Miguel Maria Vazquez Martinez
* Sixth practice of module PMDM.
* 
*/

package Errors;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ErrorsSaveLogs {
    private static File errorLog;
    
    public static void saveLogError(String ErrorMsg){
        createLogFile();
        
        try {
            FileWriter fw = new FileWriter(errorLog, true);
            fw.write(new Date().toString()+"\n");
            fw.write(ErrorMsg+"\n");
            fw.write("----------------------------------------\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ErrorsSaveLogs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    private static void createLogFile(){
        if(errorLog == null || !errorLog.exists()){
            errorLog = new File("adaErrorsLog.txt");
        }
    }
}
