/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alchhelper_draft2;

import javax.swing.*;

/**
 *
 * @author jaska
 */
public class AlchHelper_Draft2 extends JApplet {

    private JFrame frame;
    private Lenapj panel;
    
    @Override
    public void init() {
        //  this.add
        //Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    panel = new Lenapj();
                }
            });
        } catch (Exception e) {
            System.err.println("fuck, didn't complete successfully. you suck at programming.");
        }
        this.setName("Alch Helper 0.2");
        this.add(panel);
        this.setSize(730,575);
    }
}
