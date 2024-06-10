
package areaOfCircle;

import java.util.Scanner;


public class area {
    public static void main(String args[]){
        final double pi=3.14;
        int r = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the r=");
        r=sc.nextInt();
        System.out.println(2*pi*r);
    }
    
}
