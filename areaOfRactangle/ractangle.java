
package areaOfRactangle;


public class ractangle {
    private int length;
    private int breadth;
    private int area;
    ractangle(int length,int breadth){
       this.length=length;
       this.breadth=breadth;
       area=length*breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "ractangle{" + "length=" + length + ", breadth=" + breadth + ", area=" + area + '}';
    }


    
}
