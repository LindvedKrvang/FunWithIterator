/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithiterator;

import funwithiterator.be.Iterator;
import funwithiterator.be.Robot;
import funwithiterator.be.RobotArmy;

/**
 *
 * @author Rasmus
 */
public class FunWithIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RobotArmy army = new RobotArmy();

        for (Iterator iter = army.getIterator(); iter.hasNext();) {
            Robot r = (Robot) iter.next();
            r.talk("Hello World!", 1);
        }

        System.exit(0);
    }

}
