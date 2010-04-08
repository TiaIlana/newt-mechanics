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

import java.awt.Color;

public class Force {
    //the angle is recorder 0 if it is poiting east at 0 degrees
    private double angle;  //stores the angle of the force (direction)
    private boolean angleF;  //true - degrees, false - radians
    private double magnitude;   //stores the magnitude of the force in newtons
    //stores the color of the force; used as an identifier:
    private Color color = new Color(255, 255, 255); //by default it's black

    //constructors
    public Force(double magnitude){
        //by default the angle is 0, i.e. force is acting to the right
        setMagnitude(magnitude);
        setAngle(0);
    }
    public Force(double magnitude, double angle){
        this.magnitude = magnitude;
        setAngle(angle);
        angleF = true;  //by default we use degrees
    }
    public Force(Force force){
        this.magnitude = force.getMagnitude();
        this.angle = force.getAngle();
    }
    public Force(double magnitude, double angle, boolean angleF){
        this.magnitude = magnitude;
        setAngle(angle);
        this.angleF = angleF;
    }
    public Force(double magnitude, double angle, boolean angleF, Color color){
        this.magnitude = magnitude;
        setAngle(angle);
        this.angleF = angleF;
        this.color = color;
    }

    //retriever functions
    public double getAngle(){
        return angle;
    }
    public boolean getAngleFormat(){    //degrees or radians?
        return angleF;
    }
    public double getMagnitude(){
        return magnitude;
    }
    public Color getColor(){
        return this.color;
    }

    //setter functions
    public void setAngle(double angle){
        if(angle == 0) this.angle = 0;
        else if(angle < 0){     //what if the value passed is negative?
            if(Math.abs(angle)%360 == 0){    //if it is a multiple of 360 (full circle=360 degrees)
                this.angle = 0;     //then the angle is simply 0
            }
            else if(Math.abs(angle)%360 > 0){    //anything besides 0
                //take the remainder away from a full 360 degrees
                this.angle = (360-Math.abs(angle)%360);
                //if the absolute value of the paramter angle is less than 360
                //the remained will simply be the abosulte value of the angle
            }
        }
        else{   //the angle passed is bigger than 0 (what else can it be?)
            //these are similair to the above 'if else', except we know
            //angle is positive
            if(angle%360 == 0) this.angle = 0;
            else this.angle = (angle%360);  //the remainder
        }
    }
    public void setMagnitude(double magnitude){
        this.magnitude = magnitude;
    }
    public void setAngle(double angle, boolean angleF){
        setAngle(angle);    //set the angle
        this.angleF = angleF;   //set the angle format
    }

    //overiding toString method!
    //toString returns the string representation of this object
    @Override
    public String toString(){
        java.text.DecimalFormat format = new java.text.DecimalFormat("###.###");
        double magn, angle;
        magn = magnitude;
        angle = this.angle;
        //check if angle in degree or radiance
        if (angleF){ //true represents degrees
            return (format.format(magn)+"N "+format.format(angle)+"\u00B0");
        }
        else{   //it will be false, thus radians
            return (format.format(magn)+"N "+format.format(angle)+"rad");
        }
    }
    //the following method is same as above, except the paramater
    //defines which format to return the angle in (in the string)
    //(a forced formating option)
    public String toString(boolean angleF){
        java.text.DecimalFormat format = new java.text.DecimalFormat("###.###");
        double magn, angle;
        magn = magnitude;
        angle = this.angle;

        if (this.angleF){ //true represents degrees (force's angle)
            if(angleF){ //force's angle is in degrees, degrees were requested...
                //thus return as is
                return (format.format(magn)+"N "+format.format(angle)+"\u00B0");
            }
            else{   //force's angle is in degree, radians were requested
                //thus return converting angle into radians...
                angle = Math.toRadians(angle);
                //round it off again
                //angle = Truncate.Truncate(angle);
                return (format.format(magn)+"N "+format.format(angle)+"rad");
            }
                
        }
        else{   //it will be false, thus radians    (force's angle)
            if(angleF){ //force's angle is in radians, degrees were requested
                //thus convert to degrees
                //angle = Math.toDegrees(angle);
                //angle = Truncate.Truncate(angle);
                return (format.format(magn)+"N "+format.format(angle)+"\u00B0");
            }
            else{   //force's angle is in radians, radians were requested
                //return as is
                return (format.format(magn)+"N "+format.format(angle)+"rad");
            }
        }
    }
}