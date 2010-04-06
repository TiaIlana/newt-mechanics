package graphics;

import java.awt.geom.*;
import java.awt.*;
import Forces.Force;

public class Line {
    //the following function draw from a force with the spcified
    //length. It must be provided with a graphics object to draw in
    //and the origin of the line (as well as a force and legth of the line)
    public static void draw(Graphics2D g2, Point2D center,
                Force force, double length){
            //for ease of use:
            double angle = force.getAngle();
            boolean angleF = force.getAngleFormat();
            if(!angleF){    //if the angle is in radians
                angle = Math.toDegrees(angle);  //conver it to degrees
            }

            //define coordinate variables:
            //x,y - intial points, xNew,yNew - new points
            double x, y, xNew, yNew;

            //set the initial x and y according to legth specfied:
            x = length;
            //no change in y, as the initil point is parallel to the center point:
            y = 0;

            //use the transofrmation formula to find the xNew and yNew:
            xNew = (Math.cos(angle*Math.PI/180)*x)-(Math.sin(angle*Math.PI/180)*y);
            yNew = (Math.sin(angle*Math.PI/180)*x)+(Math.cos(angle*Math.PI/180)*y);

            //convert the newly found end point of line to a point
            //relative to the center:
            Point2D end = new Point2D.Double(xNew+center.getX(),
                    center.getY()-yNew);
            //draw the line!
            g2.draw(new Line2D.Double(center, end));
        }
}
