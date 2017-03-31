/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.GameControl;
import java.io.FileWriter;
import java.io.IOException;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class WaterView extends View{

    public WaterView() {
    super("\n|Choose from the two ways you can have water. Jugs or gallons|"
                + "\nJ - Jugs                                                  "
                + "\nG - Gallons"
                + "\nL- Leave and exit"
            + "\nP - Print report"
                + "\nQ - Quit")
                ;
   
    }
    
      //Two function that will calculate amount of water needed
      private void calcJugAmnt() {
        System.out.println("\n*** You chose to drink in jugs ***");}

    private void calcGalAmnt() {
        System.out.println("\n*** You chose to drink in gallons ***");}

    private void goFindYourWay() {
        GameControl.createNewGame(TheLastOfUs.getPlayer());
    LeaveHospitalView resMenu = new LeaveHospitalView();
    resMenu.findWayOut();}

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
         switch (value) {
            case "J":
                    this.calcJugAmnt();
                    break;
            case "G":
                    this.calcGalAmnt();
                    break;
            case "L" :
                    this.goFindYourWay();
            case "P":
                    this.sceneReport();
                    break;
                    
                    
                    
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    }

    private void sceneReport() {
       FileWriter outFile = null;
    
    String fileLocation = "sceneReport.txt";
    
    try {
    outFile = new FileWriter(fileLocation);
    outFile.write("I chose to rink water for my health recovery.\n");
    outFile.flush();
    }
    catch (IOException ex1){
    System.out.println("Error closing file...");
    } finally {
        if (outFile != null) {
        try{
            outFile.close();
        }   catch (IOException ex2) {
            System.out.println("Error closing files.");
        }
        }
    } }
}
