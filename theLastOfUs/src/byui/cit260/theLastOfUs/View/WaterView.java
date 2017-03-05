/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.GameControl;
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
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
    }
}
