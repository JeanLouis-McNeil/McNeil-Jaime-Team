/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

import byui.cit260.theLastOfUs.control.MapControl;
import byui.cit260.theLastOfUs.control.Scene4Control;
import thelastofus.TheLastOfUs;

/**
 *
 * @author iu
 */
public class ForceDoorView extends View {
     public ForceDoorView() {
        super("\n|YOU ARE OUTSIDE... What is your first action?                                             "
                + "\nB - Begin your trip                                       "
                + "\nQ - Quit                                                  ")
                ;
    }
@Override
    public boolean doAction(String value) {
         value = value.toUpperCase();// convert menuOption to upper case.
        
        switch (value) {


            case "B":
                    this.beginTrip();
                    break;
            default :
                System.out.println("\n***Invalid Selection, Try Again!***");
                break;
        }
        return false;}


    private void beginTrip() {

        Scene4Control.createNewScene(TheLastOfUs.getPlayer());
    superMarketView shopping = new superMarketView();
    shopping.display();
    }

    


}
