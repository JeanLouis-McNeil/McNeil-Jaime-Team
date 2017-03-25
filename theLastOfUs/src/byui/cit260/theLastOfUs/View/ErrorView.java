/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import java.io.PrintWriter;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class ErrorView {
    
private static final PrintWriter errorFile = TheLastOfUs.getOutFile();
private static final PrintWriter logFile = TheLastOfUs.getLogFile();

public static void display(String className, String errorMessage){
errorFile.println("------------------------------------------------"
        + "\n- Error - " + errorMessage
        + "\n------------------------------------------------");

logFile.println(className + " - " + errorMessage);
}
}
