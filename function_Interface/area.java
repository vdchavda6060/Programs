
package function_Interface;
public class area implements Greetinterface {

    @Override
    public void sayHello(Ractangle a) {
        System.out.println("Ans="+a.getB()*a.getH());
    }

       
}
