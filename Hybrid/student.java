
package hybrit;


public class student extends Employee {
    private String div;

    public student(String name, String city, String dpt,String div) {
        super(name, city, dpt);
        this.div=div;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    @Override
    public String toString() {
        return "student{"+"name="+ getName() +"  city="+ getCity() + "  div=" + div + '}';
    }
    
    
}
