
package areaOfRactangle;
import java.util.*;
public class areademo {
    public static void main(String args[]){
        int length,breadth;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length=");
        length=sc.nextInt();
        System.out.print("enter the breadth=");
        breadth=sc.nextInt();
        Square s=new Square(length,breadth);
        System.out.print(s);
        
    }
    
}
