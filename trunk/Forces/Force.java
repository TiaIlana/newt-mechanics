

package Forces;

public class Force {
    //the angle is recorder 0 if it is poiting east at 0 degrees
    private double angle;  //stores the angle of the force (direction) in degrees
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
    }
    public Force(Force force){
        this.magnitude = force.getMagnitude();
        this.angle = force.getAngle();
    }

    //retriever functions
    public double getAngle(){
        return angle;
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

    //overiding toString method!
    //toString returns the string representation of this object
    public String toString(){
        //"\u00B0" - is the degree sign
        return (Double.toString(magnitude)+"N "+Double.toString(angle)+"\u00B0");
    }
}
