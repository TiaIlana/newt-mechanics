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

public class Object {
    private final static double g = 9.8;   //gravity (acceleration)
    private double mass;  //mass in kilograms
    //force applied to the object; first force is always weight:
    private ArrayList<Force> forces = new ArrayList<Force>();
    //resolved forces vertically, horizontally and overall:
    private Force vertically = new Force(0, 90), horizontally = new Force(0),
            overall = new Force(0);

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

    public void setMass(double mass){
        //set's the mass of the object
        this.mass = mass;
    }

    public void clearAllForces(){
        //clears all forces
        forces.clear();
        //back to defaults:
        vertically = new Force(0, 90);
        horizontally = new Force(0);
        overall = new Force(0);
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

    public void removeForce(Force force){
        //this function removes the specified force from the list of forces
        //applied to the object...
        forces.remove(force);   //remove the object specified
    }
    public void removeForce(int index){
        //this function removes a force by the specified index
        forces.remove(index);
    }

    //the following function will resolve the forces into 3 (vertically,
    //gorizontally and overall)
    public void resolve(){
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

        //set the overall horrizontall magnitude (i) and verticall magnitude (j)
        horizontally.setMagnitude(iOverall);
        vertically.setMagnitude(jOverall);

        //  Calculate the overall force using the overall i and j components:
        //using Pythagora's Theorem (to find magnitude):
        overall.setMagnitude(Math.sqrt(jOverall*jOverall+iOverall*iOverall));
        //Also: (tah(theta)=j/i) (overall's angle is in degrees!)
        overall.setAngle(Math.toDegrees(Math.atan(jOverall/iOverall)));
    }
}

