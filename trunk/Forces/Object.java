
package Forces;

import java.util.ArrayList;

public class Object {
    private final static double g = 9.8;   //gravity (acceleration)
    private double mass;  //mass in kilograms
    //force applied to the object; first force is always weight:
    private ArrayList<Force> forces = new ArrayList<Force>();
    //overall resolved forces vertically and horizontally:
    private Force vertically = new Force(0), horizontally = new Force(0, 90);

    //constructors
    public Object(){    //by default mass is 0
        this.mass = 0;
    }
    public Object(double mass){
        this.mass = mass;   //asign mass
        Force force = new Force(g*mass, 270);   //temporrary
        this.forces.add(force);  //F=ma; 270 degrees is acting north
        force = new Force((-g)*mass, 270);    //reaction force; reusing temp variables
        this.forces.add(force);
    }
    public Object(double mass, Force... forces){    //any number of forces can be provided
        this.mass = mass;   //asign mass
        Force force = new Force(g*mass, 270);     //temporrary
        this.forces.add(force);     ////F=ma; 270 degrees is acting north
        force = new Force((-g)*mass, 270);  //reaction force; reusing temp again
        this.forces.add(force); //add the reaction force
        //asign the passed amount of forces
        addForces(forces);
    }

    public void addForces(Force... forces){
        //add the list of new forces provided
        for(int i=0; i < forces.length; i++){
            this.forces.add(forces[i]);   //first force is always weight
        }
    }

    public void clearAllForce(){
        //clears all forces
        forces.clear();
    }

    //the following function will resolve the forces into one (overall)
    public void resolve(){
        //find all forces which point north or south with no angle variation
        //and all which point west or east with no angle variation...
        //otherwise deal with the angles and add force to
        //the horizontall and verticall overall forces
        for(int i = 0; i < forces.size(); i++){
            double magn;    //temporarry storage for magnitude
            Force forceCurrent = forces.get(i);
            //north
            if(forceCurrent.getAngle() == 90){
                magn = vertically.getMagnitude();   //find the current overall magnitude
                magn += forceCurrent.getMagnitude();   //add on the current force's magnitude
                vertically.setMagnitude(magn);      //set the overall magnitude
            }
            //south
            else if(forceCurrent.getAngle() == 270){
                //find the current overall magnitude
                magn = vertically.getMagnitude();
                //deduct the current force's mangitude (since it is pointing the other way)
                magn -= (forceCurrent.getMagnitude());
                vertically.setMagnitude(magn);      //set the overall magnitude
            }
            //east
            else if(forceCurrent.getAngle() == 0 ){
                //find the current overall magnitude
                magn = vertically.getMagnitude();
                //add the current force's mangitude
                magn += (forceCurrent.getMagnitude());
                vertically.setMagnitude(magn);      //set the overall magnitude
            }
            //west
            else if(forceCurrent.getAngle() == 180){
                //find the current overall magnitude
                magn = vertically.getMagnitude();
                //deduct the current force's mangitude (since it is pointing the other way)
                magn -= (forceCurrent.getMagnitude());
                vertically.setMagnitude(magn);      //set the overall magnitude
            }
            //otherwise deal with the angles
            else{
                double angle = forceCurrent.getAngle();    //the angle
                double magnitude = forceCurrent.getMagnitude();    //the magnitude of the force

                //the angle is stored in degrees, since all trig functions
                //in the class java.lang.Math are performed in radians,
                //the angle must be first converted to radians and then
                //back to degrees to be multiplied by the magnitude of the force...
                angle = Math.toRadians(angle);


                //there are for quadrants on the j and i axies relative to the object:
                //      ^ +
                //      |
                //  2   |   1
                //<--------------> +
                //  3   |   4
                //      |
                //
                //the following 'else-if' evaluetaes which quadrant the
                //force is acting in...
                
                //first quadrant:
                if(forceCurrent.getAngle() > 0 && forceCurrent.getAngle() < 90){
                    //find the current horizontal, overall magnitude
                    magn = horizontally.getMagnitude();
                    //resolve horizontally (magntide of force * Cos(angle))
                    magn += (magnitude*Math.toDegrees(Math.cos(angle)));
                    horizontally.setMagnitude(magn); //set the overall magnitude

                    //find the current vertical, overall magnitude
                    magn = vertically.getMagnitude();
                    //resolve vertically (magntide of force * Sin(angle))
                    magn += (magnitude*Math.toDegrees(Math.sin(angle)));
                    vertically.setMagnitude(magn); //set the overall magnitude

                }
                //second quadrant:
                else if(forceCurrent.getAngle() > 90 && forceCurrent.getAngle() < 180){
                    //same thing as for first quadrant, except we are deducting
                    //from the overall horizontal force and not adding...

                    //find the current horizontal, overall magnitude
                    magn = horizontally.getMagnitude();
                    //resolve horizontally (magntide of force * Cos(angle))
                    magn -= (magnitude*Math.toDegrees(Math.cos(angle)));
                    horizontally.setMagnitude(magn); //set the overall magnitude

                    //find the current vertical, overall magnitude
                    magn = vertically.getMagnitude();
                    //resolve vertically (magntide of force * Sin(angle))
                    magn += (magnitude*Math.toDegrees(Math.sin(angle)));
                    vertically.setMagnitude(magn); //set the overall magnitude

                }
                //third quadrant:
                else if(forceCurrent.getAngle() > 180 && forceCurrent.getAngle() < 270){
                    //same thing as for thrid quadrant, except we are deducting
                    //from the overall horizontal and vertical
                    //force and not adding to any...

                    //find the current horizontal, overall magnitude
                    magn = horizontally.getMagnitude();
                    //resolve horizontally (magntide of force * Cos(angle))
                    magn -= (magnitude*Math.toDegrees(Math.cos(angle)));
                    horizontally.setMagnitude(magn); //set the overall magnitude

                    //find the current vertical, overall magnitude
                    magn = vertically.getMagnitude();
                    //resolve vertically (magntide of force * Sin(angle))
                    magn -= (magnitude*Math.toDegrees(Math.sin(angle)));
                    vertically.setMagnitude(magn); //set the overall magnitude

                }
                //fourth quadrant:
                else{
                    //same thing as for fourth quadrant, except we are now
                    //adding to the horizontal overall magnitude...

                    //find the current horizontal, overall magnitude
                    magn = horizontally.getMagnitude();
                    //resolve horizontally (magntide of force * Cos(angle))
                    magn += (magnitude*Math.toDegrees(Math.cos(angle)));
                    horizontally.setMagnitude(magn); //set the overall magnitude

                    //find the current vertical, overall magnitude
                    magn = vertically.getMagnitude();
                    //resolve vertically (magntide of force * Sin(angle))
                    magn -= (magnitude*Math.toDegrees(Math.sin(angle)));
                    vertically.setMagnitude(magn); //set the overall magnitude
                    
                }
            }
        }
    }
}
