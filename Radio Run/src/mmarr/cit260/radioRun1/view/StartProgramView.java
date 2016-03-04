/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmarr.cit260.radioRun1.view;

/**
 *
 * @author Matthew
 */

public class StartProgramView {

    private final String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPLEASE ENTER YOUR NAME: ";
        this.displayBanner();

    }

    private void displayBanner() {
        System.out.println("\n***************************************************************************\n"
                + "* RRRRR    AAAA   DDDDD  IIIIII  OOOO       QQQQ   UU  UU  IIIIII  ZZZZZZ *\n"
                + "* RR  RR  AA  AA  DD  DD   II   OO  OO     QQ  QQ  UU  UU    II       ZZ  *\n"
                + "* RRRRR   AAAAAA  DD  DD   II   OO  OO     QQ  QQ  UU  UU    II      ZZ   *\n"
                + "* RR  RR  AA  AA  DD  DD   II   OO  OO     QQ  QQ  UU  UU    II     ZZ    *\n"
                + "* RR  RR  AA  AA  DDDDD  IIIIII  OOOO       QQQQ    UUUU   IIIIII  ZZZZZ  *\n"
                + "*                                              QQ                         *\n"
                + "* <S> – Start New Game                     ---------------------          *\n"
                + "* <H> – Help                              |An Amateur Radio Exam|         *\n"
                + "* <Q> – Quit                              |    Practice Game    |         *\n"
                + "* Select an option.                        ---------------------          *\n"
                + "***************************************************************************");
    }

    public void displayStartProgramView() {
        /* displayView(): void 
           BEGIN  
             do    
                Prompt for and get the players name
                if (playersName == “Q”) then    
                  exit     

                do the action and display the next view 

             while the action is not successful 
           END  
         */
        
        boolean done = false;
        do{
            String playersName = this.getPlayersName();
            if (playersName.equalsIgnoreCase("Q"))
                return;
            done = this.doAction(playersName);
            
        } while (!done);
        }

    private String getPlayersName() {
        System.out.println("\n***CALLED getPlayersName FUNCTION");
        return "Joe";
    }
    private boolean  doAction(String playersName) {
         System.out.println("***CALLED doAction FUNCTION");
         return true;
    }

