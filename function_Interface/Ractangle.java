
package function_Interface;


public class Ractangle {
    private int h,b;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Ractangle() {
        this.h = h;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Ractangle{" + "h=" + h + ", b=" + b + '}';
    }
    
}
