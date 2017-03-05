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
public class SerumView extends View {
    
    public SerumView() {
    super("\n|Choose from these ways to have serum. Packs or injection|"
                + "\nP - Packs                                                 "
                + "\nI - Injection"
                + "\nL - Leave and exit"
                + "\nQ - Quit")
                ;
        }
    
 
    @Override
 public boolean doAction(String menuOption4) {
        menuOption4 = menuOption4.toUpperCase();// convert menuOption to upper case.
        
        switch (menuOption4) {
            case "P":
                    this.calcPackAmnt();
                    break;
            case "I":
                    this.calcInjAmnt();
                    break;
            case "L" :
                    this.goFindYourWay();        
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;
 }
     private void calcPackAmnt() {
        System.out.println("\n*** calcPackAmnt() function called ***");}

    private void calcInjAmnt() {
        System.out.println("\n*** calcInjAmnt() function called ***");}

    private void goFindYourWay() {
        GameControl.createNewGame(TheLastOfUs.getPlayer());
    LeaveHospitalView resMenu = new LeaveHospitalView();
    resMenu.findWayOut();}

   
}
    

