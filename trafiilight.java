package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();
        double t = Double.parseDouble(number);
        
        double rem = t % 5 ;
        if(rem >= 0 && rem <3 ){
            System.out.println("green");
        }else if(rem >= 3 && rem < 4){
            System.out.println("yellow");
        }else {
            System.out.println("red");
        }
            
        
        // if ( ( rem <=3 ) && ( rem >=1) )
        // System.out.println("green");
        // else if ( rem==4 )
        // System.out.println("yellow");
        // else if ( rem==0 )
        // System.out.println("red");
    }
}