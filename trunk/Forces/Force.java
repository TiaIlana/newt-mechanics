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

import java.math.BigInteger;
import java.text.DecimalFormat;

public class Force {
    //the angle is recorder 0 if it is poiting east at 0 degrees
    private double angle;  //stores the angle of the force (direction)
    private boolean angleF;  //true - degrees, false - radians
    private double magnitude;   //stores the magnitude of the force in newtons

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

    //retriever functions
    public double getAngle(){
        return angle;
    }
    public boolean getAngleFormat(){    //defrees or radians?
        return angleF;
    }
    public double getMagnitude(){
        return magnitude;
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
        //prepare magnitude and angle for formating (to 3 decimal places)
        java.math.MathContext mc = new 
                java.math.MathContext(3, java.math.RoundingMode.DOWN);
        java.math.BigDecimal magn = new java.math.BigDecimal(magnitude, mc);
        java.math.BigDecimal angle = new java.math.BigDecimal(this.angle, mc);
        //check if angle in degree or radiance
        if (angleF){ //true represents degrees
            return (magn.toPlainString()+"N "+angle.toPlainString()+"\u00B0");
        }
        else{   //it will be false, thus radians
            return (magn.toPlainString()+"N "+angle.toPlainString()+"rad");
        }
    }
    //the following method is same as above, except the paramater
    //defines which format to return the angle in (in the string)
    //(a forced formating option)
    public String toString(boolean angleF){
        //prepare magnitude and angle for formating (to 3 decimal places)
        java.math.MathContext mc = new
                java.math.MathContext(3, java.math.RoundingMode.DOWN);
        java.math.BigDecimal magn = new java.math.BigDecimal(magnitude, mc);
        java.math.BigDecimal angle = new java.math.BigDecimal(this.angle, mc);
        if (this.angleF){ //true represents degrees (force's angle)
            if(angleF){ //force's angle is in degrees, degrees were requested...
                //thus return as is
                return (magn.toPlainString()+"N "
                        +angle.toPlainString()+"\u00B0");
            }
            else{   //force's angle is in degree, radians were requested
                //thus return converting angle into radians...
                angle= new java.math.BigDecimal(Math.toRadians(this.angle), mc);
                return (magn.toPlainString()+"N "+angle.toPlainString()+"rad");
            }
                
        }
        else{   //it will be false, thus radians    (force's angle)
            if(angleF){ //force's angle is in radians, degrees were requested
                //thus convert to degrees
                angle= new java.math.BigDecimal(Math.toDegrees(this.angle), mc);
                return (magn.toPlainString()+"N "
                        +angle.toPlainString()+"\u00B0");
            }
            else{   //force's angle is in radians, radians were requested
                //return as is
                return (magn.toPlainString()+"N "+angle.toPlainString()+"rad");
            }
        }
    }
}
