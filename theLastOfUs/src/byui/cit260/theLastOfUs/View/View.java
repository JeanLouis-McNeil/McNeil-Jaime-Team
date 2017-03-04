/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import java.util.Scanner;

/**
 *
 * @author iu
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    public View(){
    }
    
    public View (String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
    boolean done = false;
        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                   return;
            done = this.doAction(value);
                }
   
    while(!done);
}
    
    @Override
    public String getInput(){
    Scanner input =  new Scanner(System.in);//get infile for keyboard
    String value = null; //value to be returned
    boolean valid = false; //initialize to not valid
    
    while (!valid) { 
            System.out.println("\n" + this.displayMessage);
    
    value = input.nextLine();
    value = value.trim();
    
    if (value.length() < 1) {
        System.out.println("\n You must enter a value ");
        continue;
        }
        break;  
    }
    return value;
    }
}

