package graphics;

import java.awt.*;
import java.awt.geom.*;
import Forces.Force;

public class Arrow{
    public static void draw(Graphics2D g2, Point2D center,
                Force force, double length, double arrowLinesLength) {
        int angleArrow = 10;  //angle of arrow lines
        double angle = force.getAngle();    //angle of arrow
        //check if in degrees
        if(force.getAngleFormat()){ //if it is...
            //convert ot radians (make it negative as well)
            angle = -Math.toRadians(angle);  
        }
        else{   //otherwise simply make it negative:
            angle = -angle;
        }
        //NOTE: we are making the angle negative because of the way
        //      the AffineTransform class operates differs from the
        //      way the rest of the program is implempt

        //create new path for the arrow
        Path2D.Double path = new Path2D.Double();
        ////draw the line
        path.moveTo(0, 0);   //init point at center
        path.lineTo(length, 0);     //main arrow line
        //the first arrow line:
        path.lineTo(length-arrowLinesLength, 
                arrowLinesLength*Math.sin(angleArrow));
        //second arrow line:
        path.moveTo(length, 0); //move point back to head of line
        path.lineTo(length-arrowLinesLength, 
                -(arrowLinesLength*Math.sin(angleArrow)));

        ////move and rotate the line to the center:
        //create roation transformation instance:
        AffineTransform transform = AffineTransform.getRotateInstance(angle);
        //rotate:
        path.transform(transform);
        //create moving transformation instance:
        transform = AffineTransform.getTranslateInstance(center.getX(),
                center.getY());
        //move/translate:
        path.transform(transform);

        //draw it!
        g2.draw(path);
    }
}