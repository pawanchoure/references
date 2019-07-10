package com.pawanchoure.bigjava.objects;

class FloatVsDoubleComparison{  
    public static void main(String[] args){  
        float f1=3.2f;  
        float f2=6.5f;  

        if(f1==3.2){
            System.out.println("same");  
        }else{
            System.out.println("different");  
        }
        if(f2==6.5){
            System.out.println("same");  
        }else{  
            System.out.println("different");  
        }
        
        System.out.println("3.2F is: "+Float.toHexString(3.2F));
        System.out.println("3.2  is: "+Double.toHexString(3.2));
        System.out.println("6.5F is: "+Float.toHexString(6.5F));
        System.out.println("6.5  is: "+Double.toHexString(6.5));
    }  
} 

//Output
/*
 * different
 * same
 * 
 * 3.2F is: 0x1.99999ap1
 * 3.2  is: 0x1.999999999999ap1
 * 6.5F is: 0x1.ap2
 * 6.5  is: 0x1.ap2
 */

//Explanation
/*
 * 
 * Generally, a number has an exact representation if it equals A * 2^B, where A and B are integers 
 * whose allowed values are set by the language specification (and double has more allowed values).
	In this case,
	6.5 = 13/2 = (1+10/16)*4 = (1+a/16)*2^2 == 0x1.ap2, while
	3.2 = 16/5 = ( 1 + 9/16 + 9/16^2 + 9/16^3 + . . . ) * 2^1 == 0x1.999. . . p1.
	But Java can only hold a finite number of digits, so it cuts the .999. . . off at some point. (You may remember from math that 0.999. . .=1. That's in base 10. In base 16, it would be 0.fff. . .=1.)
 */


