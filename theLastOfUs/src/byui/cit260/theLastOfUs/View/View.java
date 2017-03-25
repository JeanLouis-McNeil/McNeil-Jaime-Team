/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */


public abstract class View implements ViewInterface {
    protected String displayMessage;
    protected final BufferedReader keyboard = TheLastOfUs.getInFile();
    protected final PrintWriter console = TheLastOfUs.getOutFile();
    
    public View(){
    }
    
    public View (String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
    boolean done = false;
        do {
            this.console.println(this.displayMessage);
            String value = this.getInput();
            done = this.doAction(value);
                }
   
    while(!done);
}
    
    @Override
    public String getInput(){
    String value = null; //value to be returned
    boolean valid = false; //initialize to not valid
    
    try {
    while (!valid) { 
            System.out.println("\n" + this.displayMessage);
    
    value = this.keyboard.readLine();
    value = value.trim();
    
    if (value.length() < 1) {
        ErrorView.display(this.getClass().getName(), "You must enter a value.");
        continue;
        }
        break;  
    }
    }
    catch (Exception e) {
    ErrorView.display(this.getClass().getName(), " Error reading message " + e.getMessage());
    }
    return null;
    }
}

