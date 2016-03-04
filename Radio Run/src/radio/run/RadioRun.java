/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio.run;

import mmarr.cit260.radioRun1.model.Game;
import mmarr.cit260.radioRun1.model.Radio;
import mmarr.cit260.radioRun1.view.StartProgramView;

/**
 *
 * @author Matthew
 */
public class RadioRun {

    private static Game currentGame;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RadioRun.currentGame = currentGame;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
    }
}
