/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theLastOfUs.View;

/**
 *
 * @author iu
 */
class MapView {
private String map;

    void watchMap() {
       this.map = "\n|*********************************************************|"
                + "\n|L1                                                       |"
                + "\n|      L2                                 L7              |"
                + "\n|                           L6                            |"
                + "\n|   L3                                                    |"
                + "\n|                                                         |"
                + "\n|                                                         |"
                + "\n|       L4              L5                                |"
                + "\n|                                                   L8    |"
                + "\n|*********************************************************|"
                + "\nQ - Quit Map                                               "
               ;
    
    this.displayMap();
    
    }

    private void displayMap() {
         boolean done = false;
        do {
               System.out.println(map);
               String mapOption = this.getMapOption();
               if (mapOption.toUpperCase().equals("Q"))
                   return;
               done = this.mapAction(mapOption);
        } while(!done);
    
    }

    private String getMapOption() {
        System.out.println("\n*****getMapOption function called ****");
        return "Map";
    }

    private boolean mapAction(String mapOption) {
       System.out.println("\n*****getMapOption function called ****");
       return true;
    }
    
}
