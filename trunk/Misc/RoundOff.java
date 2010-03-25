package Misc;

public class RoundOff {
    public static final double LOG10 = Math.log(10.0);
    //the following function rounds off a double
    //to the provided amount of significant figures
    //using a mathematicall algortihm...
    public static double RoundOff(double val, int sigfigs){
       //Use the base-10 logarithm (Math.log(x)/Math.log(10))
       //to normalize the number, round, then restore...
       int btl;
       btl = (int)(Math.ceil(Math.log(val)/LOG10));
       btl -= sigfigs;
       double nf = (Math.pow(10.0,(double)btl));
       double rval = val / nf;
       rval = Math.rint(rval);
       rval = rval * nf;
       return val;
    }
}
