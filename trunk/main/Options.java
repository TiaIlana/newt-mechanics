package main;


public class Options {
    private boolean angle;  //tue - degrees, false - radians

    public Options(){
        //by default angle is set to degrees
        angle = true;
    }

    public void setAngle(boolean angle){
        if(angle) this.angle = true;    //to degrees
        else this.angle = false;        //to radians
    }

    public boolean getAngle(){
        return angle;
    }
}
