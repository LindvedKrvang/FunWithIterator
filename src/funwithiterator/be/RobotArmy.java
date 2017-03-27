/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithiterator.be;

/**
 *
 * @author Rasmus
 */
public class RobotArmy implements Container {

    private Robot[] robots = {
        new ModernRobot(), new ModernRobot(), new ModernRobot(), new ModernRobot(),
        new ModernRobot(), new ModernRobot(), new ModernRobot(), new ModernRobot(),
        new ModernRobot(), new ModernRobot(), new ModernRobot(), new ModernRobot(),
        new ModernRobot(), new ModernRobot(), new ModernRobot(), new ModernRobot(),
        new ModernRobot(), new ModernRobot(), new ModernRobot(), new ModernRobot()};

    @Override
    public Iterator getIterator() {
        return new RobotIteratorCollection();
    }

    private class RobotIteratorCollection implements Iterator {

        int i = 0;

        @Override
        public boolean hasNext() {
            return i < robots.length;
        }

        @Override
        public Object next() {
            return this.hasNext() ? robots[i++] : null;
        }
    }
}
