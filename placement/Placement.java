
package placement;

import java.util.Scanner;


public class Placement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NextChaildClasss cc=new NextChaildClasss();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount");
        cc.setAdmount(sc.nextInt());
        System.out.println(cc);
    }
    
}
