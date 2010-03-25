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
