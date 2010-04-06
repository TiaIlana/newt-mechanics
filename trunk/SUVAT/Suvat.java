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

package SUVAT;

import primitive_wrapers.ODouble;

public class Suvat {
	public static char suvatChar[] = {'s', 'u', 'v', 'a', 't'};	//suvat char array for looping
	protected boolean suvatFlags[] = {false, false, false, false, false};  //flag array for set or unset variables
	protected double suvatVal[] = {0, 0, 0, 0, 0};//suvat variables array first element is 's', second 'u' etc..

	public Suvat(double values[], boolean flags[]){
		//'value' - the suvat values
		//'flags' - set/unset flags for the suvat values
		
		//copy the variable values
		System.arraycopy(values, 0, suvatVal, 0, suvatVal.length);
		//copy the flag values
		System.arraycopy(flags, 0, suvatFlags, 0, suvatFlags.length);	 
	 }
	  
	public boolean set(double var_val, char var_name){
		/**
		 * Function: set's variables (hence the name! :D)
		 * var_name - will take a variable name
		 * var_val - takes a value to be set
		 */
		//checking if var_name is correct, if not return false (error)
		if(findInArray(suvatChar, var_name) == (suvatChar.length+1)) return false;
		//otherwise set the appropriate variable
		else{
			suvatVal[findInArray(suvatChar, var_name)] = var_val;
			suvatFlags[findInArray(suvatChar, var_name)] = true;
			return true;	//successful
		}
	  }

	public boolean clear(char var_name){
		/**
		 * Function: 'clear' clears variables
		 * var_name - will take a variable name
		 */
		 switch (var_name){
		 case 's':
			 suvatFlags[findInArray(suvatChar, 's')] = false;	//since this is false
			 break;
		 case 'u':
			 suvatFlags[findInArray(suvatChar, 'u')] = false;	//since this is false
			 break;
		 case 'v':
			 suvatFlags[findInArray(suvatChar, 'v')] = false;	//since this is false
			 break;
		 case 'a':
			 suvatFlags[findInArray(suvatChar, 'a')] = false;	//since this is false
			 break;
		 case 't':
			 suvatFlags[findInArray(suvatChar, 't')] = false;	//since this is false
			 break;
		 default:
			 return false; //if NOT successful
		 }
		 return true; //if successful
	}

	public boolean retrieve(char var_name, ODouble value){
		/**
		 *	Function: retrieves variables
		 *	var_name - will take a variable name
		 *	value - a reference which is used to return values of variables
		 */
		int i = findInArray(suvatChar, var_name); 	//retrieve array index
		//check if var_name is correct or the variables is set
		if(i > suvatChar.length || suvatFlags[i] == false ) return false;	//failed to pass checks
		else{
			if(value != null){
				value.val = suvatVal[i];	//""return""  the requested variable value
				return true; 	//Successful
			}
			else if (value == null){		//it might now have been initialised...
				value = new ODouble(suvatVal[i]);
				return true;
			}
		return false;	//something went wrong...
		}
	}
	
	public boolean resolve(){
		String unsetStr = "", setStr = "";	//for variable names
		double setVal[] = new double [5];	//for variable values (there can only be 5)
		
		//adds set variables values to setVal,
		//unset variable names to unsetStr 
		//and set variables names to setStr
		for(int i = 0, s = 0 ; i < suvatFlags.length; i++){
			if(suvatFlags[i]){
				setStr += suvatChar[i];
				setVal[s] = suvatVal[i];
				//setVal is only incremented here since it is only used under if(see above) conditions...
				s++;
				//N/B: if s was incremented in the for loops statement, it used to cause a bug with the next
				//		for loop, since it left all variables in the array as null, from the first variables
				//		to the next (i.g. s to a, was null; s was in it's proepr place and a wasnt...)
			}
			else unsetStr += suvatChar[i];
		}
		
		
		//run through the formulas according to the known(setStr) and unknown(unsetStr) variables
		for(int i = 0; i < unsetStr.length(); i++){
			switch(unsetStr.charAt(i)){
			//find which variables needs to be resolved and resolve it according to known variables
			case 's':
				int s = findInArray(suvatChar,'s');		//find which index in array is it
				if(setStr.equals("uvt")) suvatVal[s] = Equations.S.uvt(setVal);
				else if(setStr.equals("uat")) suvatVal[s] = Equations.S.uat(setVal);
				else if(setStr.equals("vat")) suvatVal[s] = Equations.S.vat(setVal);
				else if(setStr.equals("uva")){
					suvatVal[s] = Equations.S.uva(setVal);
				}
				suvatFlags[s] = true;	//Variable has to be set as set...
				break;
			case 'u':
				int u = findInArray(suvatChar,'u');		//find which index in array is it
				if(setStr.equals("svt")) suvatVal[u] = Equations.U.svt(setVal);
				else if(setStr.equals("sat")) suvatVal[u] = Equations.U.sat(setVal);
				else if(setStr.equals("sva")) suvatVal[u] = Equations.U.sva(setVal);
				else if(setStr.equals("vat")) suvatVal[u] = Equations.U.vat(setVal);
				suvatFlags[u] = true;	//Variable has to be set as set...
				break;
			case 'v':
				int v = findInArray(suvatChar,'v');		//find which index in array is it
				if(setStr.equals("sut")) suvatVal[v] = Equations.V.sut(setVal);
				else if(setStr.equals("sat")) suvatVal[v] = Equations.V.sat(setVal);
				else if(setStr.equals("sua")) suvatVal[v] = Equations.V.sua(setVal);
				else if(setStr.equals("uat")) suvatVal[v] = Equations.V.uat(setVal);
				suvatFlags[v] = true;	//Variable has to be set as set...
				break;
			case 'a':
				int a = findInArray(suvatChar,'a');		//find which index in array is it
				if(setStr.equals("sut")) suvatVal[a] = Equations.A.sut(setVal);
				else if(setStr.equals("svt")) suvatVal[a] = Equations.A.svt(setVal);
				else if(setStr.equals("suv")) suvatVal[a] = Equations.A.suv(setVal);
				else if(setStr.equals("uvt")) suvatVal[a] = Equations.A.uvt(setVal);
				suvatFlags[a] = true;	//Variable has to be set as set...
				break;
			case 't':
				int t = findInArray(suvatChar,'t');		//find which index in array is it
				if(setStr.equals("suv")) suvatVal[t] = Equations.T.suv(setVal);
				else if(setStr.equals("sua")) suvatVal[t] = Equations.T.sua(setVal);
				else if(setStr.equals("sva")) suvatVal[t] = Equations.T.sva(setVal);
				else if(setStr.equals("uva")) suvatVal[t] = Equations.T.uva(setVal);
				suvatFlags[t] = true;	//Variable has to be set as set...
				break;
			default:
				return false;	//something went wrong
			}
			
		}
		
		return true;
	}
	
	
	
	private static int findInArray(char array[], char f){
		//this simply finds a char in the array and returns it's index
		for(int i = 0; i < array.length; i++){
			if(array[i]==f) return i;
		}
		return (array.length+1);	//this should never be reached!
	}

	private static class Equations {
		// Documentation for this class is provided at the end of the file (in the comments)
		static class S {
			static double uvt(double uvt[]){
				return (0.5*(uvt[0]+uvt[1])*uvt[2]);
			}
			static double uat(double uat[]){
				return (uat[0]*uat[2]-0.5*uat[1]*uat[2]*uat[2]);
			}
			static double vat(double vat[]){
				return (vat[0]*vat[2]-0.5*vat[1]*vat[2]*vat[2]);
			}
			static double uva(double uva[]){
				return ((uva[1]*uva[1] - uva[0]*uva[0])/(2*uva[2]));
			}
		}
		static class U{
			static double svt(double svt[]){
				return (svt[0]/(0.5*svt[2]) - svt[1]);
			}
			static double sat(double sat[]){
				return ((sat[0]-0.5*sat[1]*sat[2]*sat[2])/sat[2]);
			}
			static double sva(double sva[]){
				return (Math.sqrt(sva[1]*sva[1]-2*sva[2]*sva[0]));
			}
			static double vat(double vat[]){
				return (vat[0]-vat[1]*vat[2]);
			}
		}
		static class V{
			static double sut(double sut[]){
				return (sut[0]/(0.5*sut[2])-sut[1]);
			}
			static double sat(double sat[]){
				return ((sat[0]+0.5*sat[1]*sat[2]*sat[2])/sat[2]);
			}
			static double sua(double sua[]){
				return (Math.sqrt(sua[1]*sua[1]+2*sua[2]*sua[0]));
			}
			static double uat(double uat[]){
				return (uat[0]+uat[1]*uat[2]);
			}
		}
		static class A{
			static double sut(double sut[]){
				return ((sut[0]-sut[1]*sut[2])/(0.5*sut[2]*sut[2]));
			}
			static double svt(double svt[]){
				return ((svt[1]*svt[2]-svt[0])/(0.5*svt[2]*svt[2]));
			}
			static double suv(double suv[]){
				return ((suv[2]*suv[2]-suv[1]*suv[1])/(2*suv[0]));
			}
			static double uvt(double uvt[]){
				return ((uvt[1]-uvt[0])/uvt[2]);
			}
		}
		static class T{
			static double suv(double suv[]){
				return (suv[0]/(0.5*(suv[1]+suv[2])));
			}
			static double sua(double sua[]){
				//the following will return NaN if sum in sqrt() is negative!
				return (Math.sqrt(sua[1]*sua[1]+2*sua[2]*sua[0])/sua[2]);
			}
			static double sva(double sva[]){
				//the following will return NaN if sum in sqrt() is negative!
				return (Math.sqrt(sva[1]*sva[1]-2*sva[2]*sva[0])/(-sva[2]));
			}
			static double uva(double uva[]){
				return ((uva[1]-uva[0])/uva[2]);
			}
		}
	}

}

	/*
	 *	There are 5 suvat equations:
	 * 		0. v = u + at
	 * 		1. s = 1/2(u + v)t
	 * 		2. s = ut + 1/2at^2
	 * 		3. s = vt - 1/2at^2
	 * 		4. v^2 = u^2 + 2as
	 *	Where:
	 * 		s - distance in meters (m)
	 * 		u - initial velocity in meters per second (m/s)
	 * 		v - final velocity in meters per second (m/s)
	 * 		a - acceleration in meters per second squared (m/s^2)
	 * 		t - time in seconds (s)
	 * 
	 * 	There are 5 suvat variables as listed above, where each equations contains only 4
	 * 	of the 5.
	 * 	The following table shows how to find any of 5 variables using the equations above.
	 * 	(NOTE: equations bellow are rearranged using algebra)
	 *											Table 1: (incomplete)
	 * s:	1. s=0.5*(u+v)*t	2. s=ut+0.5*a*(t^2)	3.s=vt-0.5*a*(t^2)	4.s=((v^2)-(u^2))/(2a)
	 * u:	1.
	 * v:
	 * a:
	 * t:
	 * 
	 * 	To calculate any of the suvat variables at least 3 have to be known.
	 * 	In each of the above table's equations the following variables have to be known
	 * 	to solve the equations:
	 *				Table 2:
	 * s:	1.uvt	2.uat	3.vat	4.uva
	 * u:	1.svt	2.sat	4.sva	5.vat
	 * v:	1.sut	3.sat	4.sua	5.uat
	 * a:	2.sut	3.svt	4.suv	5.uvt
	 * t:	1.suv	2.sua	3.sva	5.uva
	 * 
	 * In the class 'Equations' there are 5 classes each resembling on of the suvat variables.
	 * Each class has a function which calculates and returns the appropriate suvat variable
	 * using the equations in 'Table 1'. 
	 * Each functions requires 3 known suvat variables. The variables required are noted by the
	 * array's parameter name and function name. The variables are passed in a matter of an array
	 * and have to be in the order of the function name (or array's parameter name).
	 * To clarify, please see the following example:
	 * 		e.g Function 'uvt' under class S will return suvat variable s (distance).
	 * 			An array must be passed to the function which contains 3 variables: u, v and t.
	 * 			These variables must be places in the array in that exact order:
	 * 					i.e: double uvt[] = {1, 2, 3};
	*/