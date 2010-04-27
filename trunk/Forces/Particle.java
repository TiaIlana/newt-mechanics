/*
 Copyright (C) 2010  Levs Ustinovs

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

To contact the author please email to levi.ustinov@gmail.com.
 */

package Forces;

import java.util.ArrayList;

public class Particle {
    private final static double g = 9.8;   //gravity (acceleration)
    private double mass;  //mass in kilograms
    //forces applied to the object; first force is always weight and
    //second is always the reaction to the weight
    private ArrayList<Force> forces = new ArrayList<Force>();
    //resolved forces vertically, horizontally and overall:
    private Force vertically = new Force(0, 90);
    private Force horizontally = new Force(0);
    private Force overall = new Force(0);
    private double friction;    //stores value of friction of the object/surface
    private boolean frictionF = false;  //flag for set and not set firction
    //flag for if the resolved forces are up to date:
    private boolean resolved = false;

    //constructors
    public Particle(){
        this.mass = 0;  //by default mass is 0
    }
    public Particle(double mass){
        this.mass = mass;   //asign mass
        Force force = new Force(g*mass, 270);   //temporrary
        this.forces.add(force);  //F=ma; 270 degrees is acting north
        force = new Force((-g)*mass, 270);    //reaction force; reusing temp variables
        this.forces.add(force);
    }
    public Particle(double mass, Force... forces){    //any number of forces can be provided
        this.mass = mass;   //asign mass
        Force force = new Force(g*mass, 270);     //temporrary
        this.forces.add(force);     ////F=ma; 270 degrees is acting north
        force = new Force((-g)*mass, 270);  //reaction force; reusing temp again
        this.forces.add(force); //add the reaction force
        //asign the passed amount of forces
        addForces(forces);
    }

    //retriever functions
    public double getJ(){   //returns the resolved vertical force's magnitude
        return vertically.getMagnitude();
    }
    public double getI(){   //returns the resolved horizontal force's magnitude
        return horizontally.getMagnitude();
    }
    public Force getOverall(){  //return the overall force
        return overall;
    }
    public double getFriction(){
        //return the friction if set
        if(frictionF) return this.friction;
        //and if not a negative value
        else return -1;
    }
    public int numForces(){ //returns the number of forces applied
        return forces.size();
    }
    public Force getForce(int i){   //returns a force by it's index
        return forces.get(i);
    }
    public boolean isResolved(){
        return resolved;
    }
    public double getMass(){
        return mass;
    }

    //remover functions
    public void removeForce(Force force){
        //this function removes the specified force from the list of forces
        //applied to the object...
        forces.remove(force);   //remove the object specified
    }
    public void removeForce(int index){
        //this function removes a force by the specified index
        forces.remove(index);
    }
    public void clearAllForces(){
        //clears all forces
        forces.clear();
        //back to defaults:
        vertically = new Force(0, 90);
        horizontally = new Force(0);
        overall = new Force(0);
    }
    public void clearFriction(){
        //simply turn off the flag
        frictionF = false;
    }
    
    //setter functions
    public void setFriction(double friction){
        //set the friction
        this.friction = friction;
        frictionF = true;
    }
    public void setMass(double mass){
        //set's the mass of the object
        this.mass = mass;

        /*  Code not needed anymore...
        //add the cancelling out forces produced by gravity*mass: (action+reaction=0)
        Force force = new Force(g*mass, 270);   //temporrary
        this.forces.add(force);  //F=ma; 270 degrees is acting north
        force = new Force((-g)*mass, 270);    //reaction force; reusing temp variables
        this.forces.add(force);
        */
    }
    public void addForces(Force... forces){
        //NOTE: the parameter can be a single force...
        //add the list of new forces provided
        for(int i=0; i < forces.length; i++){
            this.forces.add(forces[i]);   //first force is always weight
        }
    }
    public void isResolved(boolean flag){
        resolved = flag;
    }

    //the following function will resolve the forces into 3 (vertically,
    //gorizontally and overall)
    public void resolve(boolean gravity){
        //stores the angle and magnitude of the current force:
        double angle, magn;
        //stores the overall i and j vector components
        double iOverall = 0 , jOverall = 0;
        
        //resolve each force into i and j vector components
        for(int index = 0; index < forces.size(); index++){

            //check if magnitude is 0, if it is move on to the next force
            //(if magnitude of the force is 0, it has no effect)
            if(forces.get(index).getMagnitude() == 0) continue;
            angle = forces.get(index).getAngle();
            magn = forces.get(index).getMagnitude();

            ////check if the angle is a right angle:
            ////if it is, the force is simply acting north, south, east and
            ////west accordingly (no need for further calculation)
            //component or simply directly to the right:
            if(angle==0){
                iOverall += magn;
                continue;
            }
            else if(angle==180){
                iOverall -= magn;
                continue;
            }
            else if(angle==90){
                jOverall += magn;
                continue;
            }
            else if(angle==270){
                jOverall -= magn;
                continue;
            }

            double i, j;    //stores i and j components of current force

            //java.Math performs triginometric calculations in radians.
            //thus check if angle is in degrees and if it is convert
            //it to radians (and change the local angle format
            //setting to be safe)
            if(forces.get(index).getAngleFormat() == true)
                angle = Math.toRadians(angle);  //convert to radians

            //find i (horizontall component)
            i = (magn*Math.cos(angle));
            //find j (verticall component)
            j = (magn*Math.sin(angle));

            //add i and j to the over all values
            iOverall += i;
            jOverall += j;
        }


        ////check if friction and mass are set
        ///(since they produce counter force):
        if(frictionF && mass != 0){      //mass of 0 is like mass not set...
            ////calculate the effect produced on the i component:
            ////(since friction only affects horizontal movement):
            double reactionForce;   //magnitude of the reaction force
            double resistingForce;  //the magnitude of the resistance

            reactionForce = mass*g;     //action=reaction
            resistingForce = friction*reactionForce;    //F=mu*R - mechanics!

            //check if the absolute (takes away the negative sign) overall
            //i component is bigger than or equal to the resisting force:
            if(resistingForce >= Math.abs(iOverall)){
                //the i overall becomes 0, since friction doesnt let it move:
                iOverall = 0;
            }
            else{   //the iOverall is bigger than resisting force
                //check if i was negative or positive:
                if(iOverall > 0) iOverall = iOverall - resistingForce;
                else if(iOverall < 0) iOverall = iOverall + resistingForce;
            }
        }

        //check if mass is set and gravity is present (passed as paramter)
        //and apply effect:
        if(gravity == true && mass != 0) jOverall -= g*mass;

        
        //set the overall horrizontall magnitude (i) and verticall magnitude (j)
        horizontally.setMagnitude(iOverall);
        vertically.setMagnitude(jOverall);

        
        ////Calculate the overall force using the overall i and j components
        //using Pythagora's Theorem (to find magnitude)...
        overall.setMagnitude(Math.sqrt(jOverall*jOverall+iOverall*iOverall));

        //check if I is 0, negative or positive:
        if (iOverall < 0){  //i is negative
            //calculate the angle of the resultant force between I and J:
            double angl = Math.toDegrees(Math.atan(jOverall/iOverall));
            //set the angle and add 180 degrees to it since, I is negative:
            overall.setAngle(angl+180);
        }
        else if(iOverall > 0){  //i is positive
            //check if J is 0 or isn't, since if it is we cannot use the formula
            //to find the angle (atan(0) returns 0...)
            if(jOverall!=0){
                //(tan(theta)=j/i) (overall's angle is stored in degrees!)
                overall.setAngle(Math.toDegrees(Math.atan(jOverall/iOverall)));
            }
            else{   //in case J is 0, we simply need to take a look at I...
                //if I it's negative, then angle is 180:
                if(iOverall < 0) overall.setAngle(180);
                //otherwise it is positive and the angle is 0:
                else overall.setAngle(0);
            }
        }
        else{   //in case it I is 0, there is only the J force acting (vertical)
            //check wether the J component is negative or positive (or 0)
            //and asign the corresponding angles:
            if(jOverall < 0) overall.setAngle(270);
            else if (jOverall > 0) overall.setAngle(90);
            else overall.setAngle(0);  //J is 0, thus there is no force or angle
        }

        //set the resolved flag to true, since
        //the overall force has been updated:
        resolved = true;
    }
}