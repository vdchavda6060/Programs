
package function_Interface;

public class test extends area {
    
    
    public static void main(String args[]){
        Ractangle r=new Ractangle();
        r.setB(45);
        r.setH(10);
        area a=new area();
        a.sayHello(r);
        
    }
}
